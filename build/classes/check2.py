import cv2 as cv
import numpy as np
import sys
import os
def image(lower_val,upper_val,img):
	mask = cv.inRange(img, lower_val, upper_val)
	mask_inv = cv.bitwise_not(mask)
	return mask_inv
path=sys.argv[1]
name=sys.argv[2]
img=cv.imread(path)
img = cv.cvtColor(img, cv.COLOR_BGR2RGB)
os.mkdir('C:/fruitdetectionopencv/src/output/'+name+'')
os.mkdir('C:/fruitdetectionopencv/src/input/'+name+'')
path = 'C:/fruitdetectionopencv/src/input/'+name+''
cv.imwrite(os.path.join(path , name+'.jpg'), cv.cvtColor(img, cv.COLOR_RGB2BGR))
img1 = cv.cvtColor(img, cv.COLOR_RGB2HSV)
lower_val = np.array([0,0,60])
upper_val = np.array([255,255,255])
black=image(lower_val,upper_val,img1)
lower_val1 = np.array([10,102,75])
upper_val1 = np.array([32,255,255])
yellow=image(lower_val1,upper_val1,img1)
lower_val1 = np.array([33,104,40])
upper_val1 = np.array([75,255,255])
green=image(lower_val1,upper_val1,img1)
green_count=green.size-np.count_nonzero(green)
yellow_count=yellow.size-np.count_nonzero(yellow)
black_count=np.count_nonzero(black)
if(green_count>yellow_count or (yellow_count>black_count and green_count!=0)):
	lower=np.array([0,104,20])
	upper=np.array([71,255,255])
	mask=cv.inRange(img1,lower,upper)
	cont,_=cv.findContours(mask,cv.RETR_EXTERNAL,cv.CHAIN_APPROX_NONE)
	maxval=max(cont,key=cv.contourArea)
	img1=np.array(img)
	cont_image=cv.drawContours(img1,cont,-1,255,3);
	x,y,w,h=cv.boundingRect(maxval)
	cv.rectangle(img,(x,y),(x+w,y+h),(0,0,0),3)
	path = 'C:/fruitdetectionopencv/src/output/'+name+''
	cv.imwrite(os.path.join(path , name+'.jpg'), cv.cvtColor(img, cv.COLOR_RGB2BGR))
	cv.imwrite(os.path.join(path , name+'countour'+'.jpg'),cv.cvtColor(cont_image, cv.COLOR_RGB2BGR))
	cv.imwrite(os.path.join(path , name+'gray'+'.jpg'),cv.cvtColor(mask, cv.COLOR_RGB2BGR))
else:
	mask=cv.bitwise_xor(cv.bitwise_xor(green,yellow),black)
	cont,_=cv.findContours(mask,cv.RETR_EXTERNAL,cv.CHAIN_APPROX_NONE)
	maxval=max(cont,key=cv.contourArea)
	x,y,w,h=cv.boundingRect(maxval)
	img1=np.array(img)
	cont_image=cv.drawContours(img1,cont,-1,255,3);
	cv.rectangle(img,(x,y),(x+w,y+h),(0,0,0),3)
	path = 'C:/fruitdetectionopencv/src/output/'+name+''
	cv.imwrite(os.path.join(path ,name+'.jpg'),cv.cvtColor(img, cv.COLOR_RGB2BGR))
	cv.imwrite(os.path.join(path ,name+'countour'+'.jpg'),cv.cvtColor(cont_image, cv.COLOR_RGB2BGR))
	cv.imwrite(os.path.join(path , name+'gray'+'.jpg'),cv.cvtColor(mask, cv.COLOR_RGB2BGR))
total=0
for i in cont:
	total+=cv.contourArea(i)
greenval=int((green_count/total)*100)
blackval=int((black_count/total)*100)
yellowval=int((yellow_count/total)*100)
print(str(greenval)+" "+str(blackval)+" "+str(yellowval))

	
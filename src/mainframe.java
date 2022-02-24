
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class mainframe extends javax.swing.JFrame {
     JFileChooser chooser ;
     boolean fileflag=false;
     Statement stmt;
     String path="";
     String result="";
     String result1="";
    public mainframe() {
        initComponents();
         setIconImage();
         setlabel();
         try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/fruitdetect","root","1234");  
//here sonoo is database name, root is username and password  
stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from new_table"); 
String str="";
while(rs.next())  
    str=rs.getString(8);
if(str.equals("")){
            str="result0"; 
         }
else
    str=str.substring(0,str.length()-1)+String.valueOf(str.charAt(str.length()-1)-'0'+1);
result=str;
}catch(Exception e){ System.out.println(e);} 
    }
    void setlabel(){
        ImageIcon icon=new ImageIcon("C:\\fruitdetectionopencv\\src\\daywise.jpg");
        Image img=icon.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(),Image.SCALE_SMOOTH);
        jLabel5.setIcon(new ImageIcon(img));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        black = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        yellow = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 790));
        setPreferredSize(new java.awt.Dimension(1400, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 60, 180, 60);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MAIN PAGE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 270, 170, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RESULT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 330, 150, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 200, 750);

        jPanel2.setBackground(new java.awt.Color(248, 246, 246));
        jPanel2.setLayout(null);

        jLabel5.setMaximumSize(new java.awt.Dimension(1080, 230));
        jLabel5.setMinimumSize(new java.awt.Dimension(1080, 230));
        jLabel5.setPreferredSize(new java.awt.Dimension(1080, 230));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 360, 1140, 320);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("DETECTING BANANA STAGE BASED ON COLOR");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 110, 1140, 110);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText(" DAY-1  DAY-2  DAY-3  DAY-4  DAY-5  DAY-6  DAY-7  DAY-8  DAY-9");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 320, 1150, 40);

        jTabbedPane1.addTab("tab5", jPanel2);

        jPanel3.setBackground(new java.awt.Color(248, 246, 246));
        jPanel3.setLayout(null);

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8);
        jLabel8.setBounds(40, 30, 500, 640);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("IMAGE SELECTION");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(70, 10, 120, 20);

        jButton2.setBackground(new java.awt.Color(102, 255, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("choose file");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(40, 690, 280, 40);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator6);
        jSeparator6.setBounds(570, 20, 30, 720);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator7);
        jSeparator7.setBounds(30, 740, 540, 20);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator8);
        jSeparator8.setBounds(30, 20, 30, 720);

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator9);
        jSeparator9.setBounds(30, 20, 40, 20);

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator10);
        jSeparator10.setBounds(180, 20, 390, 40);

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Submit");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(1000, 670, 120, 50);

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VIEW");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(1000, 640, 140, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "result", "date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 990, 600);

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(248, 246, 246));
        jPanel5.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loading1.gif"))); // NOI18N
        jPanel5.add(jLabel4);
        jLabel4.setBounds(320, 130, 410, 420);

        jTabbedPane1.addTab("tab4", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jButton4.setBackground(new java.awt.Color(0, 255, 0));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Next");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(1050, 680, 110, 50);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("contour image:");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(20, 10, 180, 40);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("gray scale image:");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(540, 10, 210, 40);

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel17);
        jLabel17.setBounds(10, 50, 490, 690);

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel18);
        jLabel18.setBounds(530, 50, 500, 690);

        jTabbedPane1.addTab("tab5", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Previous");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel7.add(jButton5);
        jButton5.setBounds(10, 682, 110, 50);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("GREEN:");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(10, 480, 110, 40);

        green.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        green.setForeground(new java.awt.Color(0, 0, 0));
        green.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(green);
        green.setBounds(120, 480, 90, 40);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("BLACK:");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(10, 530, 100, 40);

        black.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        black.setForeground(new java.awt.Color(0, 0, 0));
        black.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(black);
        black.setBounds(120, 530, 90, 40);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("YELLOW:");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(0, 590, 120, 30);

        yellow.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        yellow.setForeground(new java.awt.Color(0, 0, 0));
        yellow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(yellow);
        yellow.setBounds(120, 590, 90, 40);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("RANGE VALUES:");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(10, 10, 210, 40);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "83-99", "0-4", "4-38"},
                {"2", "5-36", "49-76", "6-28"},
                {"3", "0-1", "86-100", "0-8"},
                {"4", "0", "89-99", "0-11"},
                {"5", "0", "82-98", "0-16"},
                {"6", "0", "54-86", "8-39"},
                {"7", "0", "14-59", "36-80"},
                {"8", "0", "0-25", "70-96"},
                {"9", "0", "1-43", "61-93"}
            },
            new String [] {
                "day", "green color", "yellow color", "black color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel7.add(jScrollPane3);
        jScrollPane3.setBounds(10, 50, 1150, 190);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("DAYS:");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(20, 250, 130, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "day", "L(avg)", "L(min)", "L(max)", "a(avg)", "a(min)", "a(max)", "b(avg)", "b(min)", "b(max)", "TSS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
            jTable2.getColumnModel().getColumn(8).setResizable(false);
            jTable2.getColumnModel().getColumn(9).setResizable(false);
            jTable2.getColumnModel().getColumn(10).setResizable(false);
        }

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(10, 300, 1140, 100);

        jTabbedPane1.addTab("tab6", jPanel7);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(200, -30, 1380, 780);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String getvalue(){
        	String s = null;
                String error=null;
                String ans="";
                String anserror;

		try {
                                                String cmd[] = { "python", "C://fruitdetectionopencv//src//check2.py",
					path.replace('\\','/'), result };
			Process p = Runtime.getRuntime().exec(cmd);

			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			while ((s = stdInput.readLine()) != null) {
                                                        ans+=s;
			}
			while ((error = stdError.readLine()) != null) {
				System.out.println(s);
			}

		} catch (IOException e) {
			System.out.println("exception happened - here's what I know: ");
			e.printStackTrace();
		}
                System.out.print(ans);
                return ans;
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
         jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
         jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(Color.black);
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.white);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jTabbedPane1.setSelectedIndex(2 );
         try {
             ResultSet rs=stmt.executeQuery("select * from new_table");
             DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
             model.setRowCount(0);
                while(rs.next())
                model.addRow(new Object[]{rs.getString(8),rs.getString(9)});
             
         } catch (SQLException ex) {
             Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
         jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
         jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
            chooser = new JFileChooser();
            chooser.addChoosableFileFilter(new ImageFilter());
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileView(new MyFileView());
            chooser.setPreferredSize(new Dimension(1000,600));
            chooser.setDialogTitle("Select image");
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            fileflag=true;
            path=f.getAbsolutePath();
            String path=f.getAbsolutePath().replace("\\", "\\\\");
           
            try{
           ImageIcon icon=new ImageIcon(path);
           Image img=icon.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(),Image.SCALE_SMOOTH);
           jLabel8.setIcon(new ImageIcon(img));
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(jPanel3,"Please select only image","Alert",JOptionPane.WARNING_MESSAGE);     
                }  
        } else {
            System.out.print("closed");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if( fileflag==true){
        jTabbedPane1.setSelectedIndex(4);
        String str=getvalue();
        System.out.println(str);
        String ans[]=str.split(" ");
        System.out.println(Arrays.toString(ans));
        ImageIcon icon=new ImageIcon("C:\\fruitdetectionopencv\\src\\output\\"+result+"\\"+result+".jpg");
        Image img=icon.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(),Image.SCALE_SMOOTH);
        jLabel17.setIcon(new ImageIcon(img));
        ImageIcon icon1=new ImageIcon("C:\\fruitdetectionopencv\\src\\output\\"+result+"\\"+result+"gray.jpg");
        Image img1=icon1.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(),Image.SCALE_SMOOTH);
        jLabel18.setIcon(new ImageIcon(img1));
        String pat="C:/fruitdetectionopencv/src/output/"+result+"/"+result+".jpg";
        String pat2="C:/fruitdetectionopencv/src/output/"+result+"/"+result+"gray.jpg";
        String pat3="C:/fruitdetectionopencv/src/output/"+result+"/"+result+"countour.jpg";
        green.setText(ans[0]);
        black.setText(ans[1]);
        yellow.setText(ans[2]);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
  
        try{
            stmt.executeUpdate("insert into new_table values('"+path.replace("\\", "\\\\")+"','"+pat.replace("/","\\\\")+"','"+pat2.replace("/","\\\\")+"','"+pat3.replace("/","\\\\")+"',"+ans[0]+","+ans[1]+","+ans[2]+",'"+result+"','"+ dtf.format(now)+"')");
             result=result.substring(0,result.length()-1)+String.valueOf(result.charAt(result.length()-1)-'0'+1);
             System.out.println(result);
             String arr[][]={{"1", "83-99", "0-4", "4-38"},
        {"2", "5-36", "49-76", "6-28"},
        {"3", "0-1", "86-100", "0-8"},
        {"4", "0-0", "89-99", "0-11"},
        {"5", "0-0", "82-98", "0-16"},
        {"6", "0-0", "54-86", "8-39"},
        {"7", "0-0", "14-59", "36-80"},
        {"8", "0-0", "0-25", "70-96"},
        {"9", "0-0", "1-43", "61-93"}};
        int i;
        int gren,yel,blak;
        ArrayList<Integer> list =new ArrayList<Integer>();
        gren=Integer.parseInt(ans[0]);
        yel=Integer.parseInt(ans[2]);
        blak=Integer.parseInt(ans[1]);
        for(i=0;i<9;i++){
           String val1[]=arr[i][1].split("-");
           String val2[]=arr[i][2].split("-");
           String val3[]=arr[i][3].split("-");
           if(gren>=Integer.parseInt(val1[0])&&gren<=Integer.parseInt(val1[1])&&yel>=Integer.parseInt(val2[0])&&yel<=Integer.parseInt(val2[1])&&blak>=Integer.parseInt(val3[0])&&blak<=Integer.parseInt(val3[1])){
               list.add(Integer.parseInt(arr[i][0]));
               
           }
        }
        double a[][]={{32.61222,20.5404,43.3951,-18.43902,-21.5392,-16.4447,35.53199,28.3899,39.7194,8},{45.51088,32.0338,59.517,-9.05803,-14.1546,-2.3063,50.58829,38.5143,61.5784,19},{50.06212,16.9582,68.1167,2.844563,-7.4305,9.8121,54.232862,24.3048,67.6265,24},{49.695008,16.5795,67.3385,5.5353,-5.1759,10.1405,52.701584,20.0689,66.7771,26},{34.02602,8.4753,49.6906,10.15328,2.8858,17.9011,37.551844,3.2827,54.4434,27},{29.510065,2.5111,57.1761,7.929329,1.2745,14.8433,32.41458,1.7308,60.7703,27},{21.00705,3.5511,45.5587,8.27405,2.1678,13.1141,24.631501,2.4837,52.4532,27},{22.4824,5.1834,48.0375,6.79455,0.4022,14.4219,18.97983,1.3069,47.5795,27},{11.06391,2.6202,22.2782,7.34895,3.6051,13.9596,11.40927,1.9741,29.6588,29}};
           DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
             model.setRowCount(0);
                for(i=0;i<list.size();i++)
                model.addRow(new Object[]{list.get(i),a[list.get(i)-1][0],a[list.get(i)-1][1],a[list.get(i)-1][2],a[list.get(i)-1][3],a[list.get(i)-1][4],a[list.get(i)-1][5],a[list.get(i)-1][6],a[list.get(i)-1][7],a[list.get(i)-1][8],a[list.get(i)-1][9]});
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        }
        else
             JOptionPane.showMessageDialog(jPanel3,"Please select image and fill values","Alert",JOptionPane.WARNING_MESSAGE);
        

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jTabbedPane1.setSelectedIndex(4);
        int row=jTable1.getSelectedRow();
        String str=(String) jTable1.getModel().getValueAt(row,0);
         try {
             ResultSet rs=stmt.executeQuery("select * from new_table where result='"+str+"'");
             if(rs.next()){
                ImageIcon icon=new ImageIcon(rs.getString(2).replace("\\", "\\\\"));
        Image img=icon.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(),Image.SCALE_SMOOTH);
        jLabel17.setIcon(new ImageIcon(img));
        ImageIcon icon1=new ImageIcon(rs.getString(3).replace("\\", "\\\\"));
        Image img1=icon1.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(),Image.SCALE_SMOOTH);
        jLabel18.setIcon(new ImageIcon(img1));
        green.setText(rs.getString(5));
        black.setText(rs.getString(6));
        yellow.setText(rs.getString(7));
        String arr[][]={{"1", "83-99", "0-4", "4-38"},
        {"2", "5-36", "49-76", "6-28"},
        {"3", "0-1", "86-100", "0-8"},
        {"4", "0-0", "89-99", "0-11"},
        {"5", "0-0", "82-98", "0-16"},
        {"6", "0-0", "54-86", "8-39"},
        {"7", "0-0", "14-59", "36-80"},
        {"8", "0-0", "0-25", "70-96"},
        {"9", "0-0", "1-43", "61-93"}};
        int i;
        int gren,yel,blak;
        ArrayList<Integer> list =new ArrayList<Integer>();
        gren=Integer.parseInt(rs.getString(5));
        yel=Integer.parseInt(rs.getString(7));
        blak=Integer.parseInt(rs.getString(6));
        for(i=0;i<9;i++){
           String val1[]=arr[i][1].split("-");
           String val2[]=arr[i][2].split("-");
           String val3[]=arr[i][3].split("-");
           if(gren>=Integer.parseInt(val1[0])&&gren<=Integer.parseInt(val1[1])&&yel>=Integer.parseInt(val2[0])&&yel<=Integer.parseInt(val2[1])&&blak>=Integer.parseInt(val3[0])&&blak<=Integer.parseInt(val3[1])){
                list.add(Integer.parseInt(arr[i][0]));
           }
        }
        double a[][]={{32.61222,20.5404,43.3951,-18.43902,-21.5392,-16.4447,35.53199,28.3899,39.7194,8},{45.51088,32.0338,59.517,-9.05803,-14.1546,-2.3063,50.58829,38.5143,61.5784,19},{50.06212,16.9582,68.1167,2.844563,-7.4305,9.8121,54.232862,24.3048,67.6265,24},{49.695008,16.5795,67.3385,5.5353,-5.1759,10.1405,52.701584,20.0689,66.7771,26},{34.02602,8.4753,49.6906,10.15328,2.8858,17.9011,37.551844,3.2827,54.4434,27},{29.510065,2.5111,57.1761,7.929329,1.2745,14.8433,32.41458,1.7308,60.7703,27},{21.00705,3.5511,45.5587,8.27405,2.1678,13.1141,24.631501,2.4837,52.4532,27},{22.4824,5.1834,48.0375,6.79455,0.4022,14.4219,18.97983,1.3069,47.5795,27},{11.06391,2.6202,22.2782,7.34895,3.6051,13.9596,11.40927,1.9741,29.6588,29}};
           DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
             model.setRowCount(0);
                for(i=0;i<list.size();i++)
               model.addRow(new Object[]{list.get(i),a[list.get(i)-1][0],a[list.get(i)-1][1],a[list.get(i)-1][2],a[list.get(i)-1][3],a[list.get(i)-1][4],a[list.get(i)-1][5],a[list.get(i)-1][6],a[list.get(i)-1][7],a[list.get(i)-1][8],a[list.get(i)-1][9]});

             }
         } catch (SQLException ex) {
             Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
         }
     
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }
 private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("banana.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel black;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel green;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel yellow;
    // End of variables declaration//GEN-END:variables
}
class ImageFilter extends FileFilter {
   public final static String JPEG = "jpeg";
   public final static String JPG = "jpg";
   public final static String GIF = "gif";
   public final static String TIFF = "tiff";
   public final static String TIF = "tif";
   public final static String PNG = "png";
   
   @Override
   public boolean accept(File f) {
      if (f.isDirectory()) {
         return true;
      }

      String extension = getExtension(f);
      if (extension != null) {
         if (extension.equals(TIFF) ||
            extension.equals(TIF) ||
            extension.equals(GIF) ||
            extension.equals(JPEG) ||
            extension.equals(JPG) ||
            extension.equals(PNG)) {
            return true;
         } else {
            return false;
         }
      }
      return false;
   }

   @Override
   public String getDescription() {
      return "Image Only";
   }

   String getExtension(File f) {
      String ext = null;
      String s = f.getName();
      int i = s.lastIndexOf('.');
   
      if (i > 0 &&  i < s.length() - 1) {
         ext = s.substring(i+1).toLowerCase();
      }
      return ext;
   } 
}
class MyFileView extends FileView
{
      public Icon getIcon(File f)
      {
      FileSystemView view=FileSystemView.getFileSystemView();
            return view.getSystemIcon(f);
      }
}
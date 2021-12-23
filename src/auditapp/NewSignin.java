/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package auditapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Yaseen Ameer
 */
public class NewSignin extends javax.swing.JFrame {
    

    /**
     * Creates new form NewSignin
     */
    public NewSignin() {
        
        koneksi_database();
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel6.setVisible(false);
         try {
          
              UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        
        }
        
        catch (Exception ex) {
            System.err.println(ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        username1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        nama_lengkap = new javax.swing.JTextField();
        usrname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        daftar = new javax.swing.JButton();
        pw2 = new javax.swing.JPasswordField();
        pw1 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(31, 36, 42));
        username.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        username.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                usernameMouseMoved(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 205, 260, 40));

        jButton1.setBackground(new java.awt.Color(169, 224, 49));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(169, 224, 49));
        jButton1.setText("Buat Akun");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRequestFocusEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_Shield_100px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 224, 49));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Lock_35px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 45));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 224, 49));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Male_User_35px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 45));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(169, 224, 49));
        jLabel19.setText("User");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 70, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 172, 150, 0));

        jPanel3.setBackground(new java.awt.Color(31, 36, 42));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_32px.png"))); // NOI18N
        jButton10.setToolTipText("Close");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setRequestFocusEnabled(false);
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_30px_3.png"))); // NOI18N
        jButton10.setVerifyInputWhenFocusTarget(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 40));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_32px_1.png"))); // NOI18N
        jButton11.setToolTipText("Minimize");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusPainted(false);
        jButton11.setRequestFocusEnabled(false);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_30px_3.png"))); // NOI18N
        jButton11.setVerifyInputWhenFocusTarget(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 40));

        username1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        username1.setForeground(new java.awt.Color(169, 224, 49));
        username1.setText("Audit Analytics System");
        jPanel3.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 380, 50));

        jPanel6.setBackground(new java.awt.Color(31, 36, 42));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama_lengkap.setBackground(new java.awt.Color(31, 36, 42));
        nama_lengkap.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        nama_lengkap.setForeground(new java.awt.Color(255, 255, 255));
        nama_lengkap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        nama_lengkap.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nama_lengkapMouseMoved(evt);
            }
        });
        jPanel6.add(nama_lengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 330, 40));

        usrname.setBackground(new java.awt.Color(31, 36, 42));
        usrname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        usrname.setForeground(new java.awt.Color(255, 255, 255));
        usrname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        usrname.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                usrnameMouseMoved(evt);
            }
        });
        jPanel6.add(usrname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 330, 40));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(169, 224, 49));
        jLabel12.setText("Daftar");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 140, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(169, 224, 49));
        jLabel14.setText("Nama Lengkap");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, 20));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(169, 224, 49));
        jLabel18.setText("Password");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 314, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(169, 224, 49));
        jLabel17.setText("Konfirmasi Password");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 314, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(169, 224, 49));
        jLabel16.setText("Username");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 314, -1));

        jButton14.setBackground(new java.awt.Color(169, 224, 49));
        jButton14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(169, 224, 49));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_To_25px.png"))); // NOI18N
        jButton14.setText("Back");
        jButton14.setBorder(null);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setRequestFocusEnabled(false);
        jButton14.setVerifyInputWhenFocusTarget(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 110, -1));

        daftar.setBackground(new java.awt.Color(152, 201, 45));
        daftar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        daftar.setForeground(new java.awt.Color(21, 25, 28));
        daftar.setText("DAFTAR");
        daftar.setBorder(null);
        daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daftar.setFocusPainted(false);
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });
        jPanel6.add(daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 330, 40));

        pw2.setBackground(new java.awt.Color(31, 36, 42));
        pw2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pw2.setForeground(new java.awt.Color(255, 255, 255));
        pw2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jPanel6.add(pw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 330, 40));

        pw1.setBackground(new java.awt.Color(31, 36, 42));
        pw1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pw1.setForeground(new java.awt.Color(255, 255, 255));
        pw1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jPanel6.add(pw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 330, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 410, 560));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 450, 620));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(169, 224, 49));
        jLabel20.setText("Password");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 70, -1));

        login.setBackground(new java.awt.Color(152, 201, 45));
        login.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(21, 25, 28));
        login.setText("LOGIN");
        login.setBorder(null);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setFocusPainted(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 260, 40));

        pw.setBackground(new java.awt.Color(31, 36, 42));
        pw.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pw.setForeground(new java.awt.Color(255, 255, 255));
        pw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 305, 260, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseMoved

    }//GEN-LAST:event_usernameMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
                username1.setVisible(false);
                jPanel6.setVisible(true);
        //       jLabel7.setVisible(false);
        //       jLabel8.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void nama_lengkapMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nama_lengkapMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_lengkapMouseMoved

    private void usrnameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnameMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_usrnameMouseMoved

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jPanel6.setVisible(false);
        username1.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            Connection kon = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_audit","root","");
            ResultSet as = kon.createStatement().executeQuery("select * from user where username='"+username.getText()+"'and password='"+String.valueOf(pw.getText())+"'");
            if(as.next()){
                menu ad = new menu();
                ad.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Email Dan Password Yang anda Masukan Salah ! ");
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(NewSignin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    username.setText("");
    pw.setText("");
    pw1.setText("");
    pw2.setText("");
    nama_lengkap.setText("");
    usrname.setText("");
    }//GEN-LAST:event_loginActionPerformed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
         try {
            sql = "INSERT INTO user VALUES ('"+nama_lengkap.getText()+
            "','"+usrname.getText()+
            "','"+pw1.getText()+
            "')";
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Yeay Kamu Telah Terdaftar. Silakan Login " +nama_lengkap.getText());
            
            stat.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal....." + e);
        }
    username.setText("");
    pw.setText("");
    pw1.setText("");
    pw2.setText("");
    nama_lengkap.setText("");
    usrname.setText("");   
    }//GEN-LAST:event_daftarActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButton11MouseClicked

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
            java.util.logging.Logger.getLogger(NewSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSignin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login;
    private javax.swing.JTextField nama_lengkap;
    private javax.swing.JPasswordField pw;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JPasswordField pw2;
    private javax.swing.JTextField username;
    private javax.swing.JLabel username1;
    private javax.swing.JTextField usrname;
    // End of variables declaration//GEN-END:variables


private Connection con;
private Statement stat;

private String sql;

private void koneksi_database(){
   try {
       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Driver Ditemukan...");
       try {
           String url = "jdbc:mysql://localhost:3306/db_audit?user=root&password=";
           con = DriverManager.getConnection(url);
           System.out.println("Terkoneksi.....");
           
       } catch (SQLException e){
           System.err.println("Tidak Terkoneksi.....");
       }
   } catch (ClassNotFoundException e){
       System.err.println("Driver Tidak Ditemukan.......");
   }
}

}

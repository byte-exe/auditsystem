/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package auditapp;


import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Yaseen Ameer
 */
public class information extends javax.swing.JFrame {
    

    /**
     * Creates new form NewSignin
     */
    public information() {
        initComponents();
        this.setLocationRelativeTo(null);
      
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel_inven2 = new javax.swing.JLabel();
        jLabel_inven3 = new javax.swing.JLabel();
        jLabel_inven5 = new javax.swing.JLabel();
        jLabel_inven6 = new javax.swing.JLabel();
        jLabel_inven7 = new javax.swing.JLabel();
        jLabel_inven8 = new javax.swing.JLabel();
        jLabel_inven9 = new javax.swing.JLabel();
        jLabel_inven10 = new javax.swing.JLabel();
        jLabel_inven11 = new javax.swing.JLabel();
        jLabel_inven12 = new javax.swing.JLabel();
        jLabel_inven13 = new javax.swing.JLabel();
        jLabel_inven14 = new javax.swing.JLabel();
        jLabel_inven15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_inven4 = new javax.swing.JLabel();
        jLabel_inven1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 172, 150, 0));

        jPanel3.setBackground(new java.awt.Color(31, 36, 42));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 0, 620));

        jLabel_inven2.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven2.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven2.setText("Maturity Level Assesment Criteria");
        jPanel1.add(jLabel_inven2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 560, 50));

        jLabel_inven3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven3.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven3.setText("4,51 - 5,00");
        jPanel1.add(jLabel_inven3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 150, 50));

        jLabel_inven5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven5.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven5.setText("0 - 0,50");
        jPanel1.add(jLabel_inven5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 50));

        jLabel_inven6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven6.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven6.setText("0,51 - 1,50");
        jPanel1.add(jLabel_inven6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 150, 50));

        jLabel_inven7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven7.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven7.setText("1,51 - 2,50");
        jPanel1.add(jLabel_inven7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, 50));

        jLabel_inven8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven8.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven8.setText("2,51 - 3,50");
        jPanel1.add(jLabel_inven8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 150, 50));

        jLabel_inven9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven9.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven9.setText("3,51 - 4,50");
        jPanel1.add(jLabel_inven9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 150, 50));

        jLabel_inven10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven10.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven10.setText("0 - Non Existents");
        jPanel1.add(jLabel_inven10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 190, 50));

        jLabel_inven11.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven11.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven11.setText("1 - Initial / Ad hoc");
        jPanel1.add(jLabel_inven11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 300, 50));

        jLabel_inven12.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven12.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven12.setText("2 - Repeatable but intuitive");
        jPanel1.add(jLabel_inven12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 310, 50));

        jLabel_inven13.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven13.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven13.setText("3 - Defined Process");
        jPanel1.add(jLabel_inven13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 310, 50));

        jLabel_inven14.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven14.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven14.setText("4 - Managed and Measurable");
        jPanel1.add(jLabel_inven14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 310, 50));

        jLabel_inven15.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_inven15.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven15.setText("5 - Optimized");
        jPanel1.add(jLabel_inven15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 200, 50));

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        jLabel_inven4.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven4.setText("Maturity Index");

        jLabel_inven1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven1.setText("Maturity Level");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel_inven4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLabel_inven1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_inven4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_inven1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 800, 50));

        jButton8.setBackground(new java.awt.Color(152, 201, 45));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(21, 25, 28));
        jButton8.setText("Menu");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 110, 40));

        jButton9.setBackground(new java.awt.Color(152, 201, 45));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(21, 25, 28));
        jButton9.setText("NEXT");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 190, 40));

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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        menu fa = new menu();
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PO9 fa = new PO9();
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel_inven1;
    private javax.swing.JLabel jLabel_inven10;
    private javax.swing.JLabel jLabel_inven11;
    private javax.swing.JLabel jLabel_inven12;
    private javax.swing.JLabel jLabel_inven13;
    private javax.swing.JLabel jLabel_inven14;
    private javax.swing.JLabel jLabel_inven15;
    private javax.swing.JLabel jLabel_inven2;
    private javax.swing.JLabel jLabel_inven3;
    private javax.swing.JLabel jLabel_inven4;
    private javax.swing.JLabel jLabel_inven5;
    private javax.swing.JLabel jLabel_inven6;
    private javax.swing.JLabel jLabel_inven7;
    private javax.swing.JLabel jLabel_inven8;
    private javax.swing.JLabel jLabel_inven9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

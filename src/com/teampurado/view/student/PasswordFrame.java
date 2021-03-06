/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teampurado.view.student;

import com.teampurado.model.classes.Attempt;
import com.teampurado.model.classes.Student;
import com.teampurado.model.database.DBHelper;
import com.teampurado.view.StudentFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diablo
 */
public class PasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form Password
     */
    public PasswordFrame() {
        initComponents();
    }
    StudentFrame sf;
    public PasswordFrame(byte examID, Student stud, StudentFrame sf){
        initComponents();
        this.examID = examID;
        this.stud = stud;
        this.sf = sf;
        db = new DBHelper();
        
        
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
        lbPass = new javax.swing.JLabel();
        btnAttempt = new javax.swing.JButton();
        pfPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lbPass.setForeground(new java.awt.Color(153, 153, 153));
        lbPass.setText("Password");

        btnAttempt.setText("Attempt");
        btnAttempt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttemptActionPerformed(evt);
            }
        });

        pfPass.setBackground(new java.awt.Color(102, 102, 102));
        pfPass.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAttempt, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPass)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pfPass))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttempt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttemptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttemptActionPerformed
        String sql = "select * from exam where examID = '"+examID+"' and password = '"+pfPass.getText()+"'";
        db.setRs(db.executeQuery(sql));
        
        try {
            if(db.getRs().next()){
                int dialog = JOptionPane.showConfirmDialog(this, "Attempt Now? You can only have 1 attempt.", "Warning", cbtn);
                cbox(dialog);
            }else{
                JOptionPane.showMessageDialog(this, "Incorrect password.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PasswordFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAttemptActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordFrame().setVisible(true);
            }
        });
    }

    public void cbox(int d){
    boolean attempt;
    if(d == JOptionPane.YES_OPTION){
        new StudentFrame().dispose();
        this.dispose();
        sf.setVisible(false);
        attempt = true;
        Attempt at = new Attempt(examID,stud.getId(),attempt);
            //new PasswordFrame(at).setVisible(true);
           new ExamFrame(examID,at,stud).setVisible(true);
        }
    }
    
    private byte examID;
    private Student stud;
    private DBHelper db;
    int cbtn = JOptionPane.YES_NO_OPTION;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttempt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbPass;
    private javax.swing.JPasswordField pfPass;
    // End of variables declaration//GEN-END:variables
}

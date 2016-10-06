package com.teampurado.view;

import com.teampurado.model.classes.Subject;
import com.teampurado.model.classes.SubjectTeacher;
import com.teampurado.model.classes.Teacher;
import com.teampurado.model.database.DBHelper;
import com.teampurado.view.teacher.ExamViewFrame;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ProfessorSci
 */
public class TeacherFrame extends javax.swing.JFrame {

    public TeacherFrame() {
        initComponents();
    }
    
    public TeacherFrame(Teacher tchr) {
        initComponents();
        this.tchr = tchr;
        db = new DBHelper();
        select = false;
        list = new ArrayList();
        
        lbUsername.setText(tchr.getId());
        lbWelcome.setText("Welcome "+tchr.getName()+"!");
        
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblSubject.getModel();
            db.setRs(db.executeQuery("select * from "+DBHelper.SUBJECT+
                    " where code in (select distinct subjectCode from "+DBHelper.SUBJECT_TEACHER+
                    " where teacherID = '"+tchr.getId()+"') order by code asc"));
            
            while(db.getRs().next()) {
                Subject nth = new Subject(db.getRs().getString("code"),db.getRs().getString("description"));
                dtm.addRow(new Object[]{nth.getCode(),nth.getDescription()});
                list.add(nth);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTeacher = new javax.swing.JPanel();
        lbAvatar = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lbWelcome = new javax.swing.JLabel();
        sclSubject = new javax.swing.JScrollPane();
        tblSubject = new javax.swing.JTable();
        lbSubjCode = new javax.swing.JLabel();
        tfSubjCode = new javax.swing.JTextField();
        lbDscrptn = new javax.swing.JLabel();
        tfDscrptn = new javax.swing.JTextField();
        btnAddSubj = new javax.swing.JButton();
        btnUpdSubj = new javax.swing.JButton();
        btnDelSubj = new javax.swing.JButton();
        btnExamView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ExamView");

        lbAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teampurado/images/user.png"))); // NOI18N
        lbAvatar.setOpaque(true);

        lbUsername.setText("username");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lbWelcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbWelcome.setText("Welcome last name, first name!");

        tblSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Code", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubjectMouseClicked(evt);
            }
        });
        sclSubject.setViewportView(tblSubject);
        if (tblSubject.getColumnModel().getColumnCount() > 0) {
            tblSubject.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblSubject.getColumnModel().getColumn(1).setPreferredWidth(225);
            tblSubject.getColumnModel().getColumn(1).setHeaderValue("Description");
        }

        lbSubjCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSubjCode.setText("Subject Code:");

        lbDscrptn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDscrptn.setText("Description:");

        btnAddSubj.setText("Add");
        btnAddSubj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubjActionPerformed(evt);
            }
        });

        btnUpdSubj.setText("Update");
        btnUpdSubj.setEnabled(false);
        btnUpdSubj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdSubjActionPerformed(evt);
            }
        });

        btnDelSubj.setText("Delete");
        btnDelSubj.setEnabled(false);
        btnDelSubj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelSubjActionPerformed(evt);
            }
        });

        btnExamView.setText("View Exam");
        btnExamView.setEnabled(false);
        btnExamView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTeacherLayout = new javax.swing.GroupLayout(pnlTeacher);
        pnlTeacher.setLayout(pnlTeacherLayout);
        pnlTeacherLayout.setHorizontalGroup(
            pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTeacherLayout.createSequentialGroup()
                        .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addComponent(sclSubject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTeacherLayout.createSequentialGroup()
                        .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbSubjCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDscrptn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSubjCode)
                            .addComponent(tfDscrptn)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTeacherLayout.createSequentialGroup()
                        .addComponent(lbWelcome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTeacherLayout.createSequentialGroup()
                        .addComponent(btnAddSubj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdSubj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelSubj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExamView)))
                .addContainerGap())
        );
        pnlTeacherLayout.setVerticalGroup(
            pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTeacherLayout.createSequentialGroup()
                        .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogout)
                            .addComponent(lbUsername))
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sclSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSubjCode)
                    .addComponent(tfSubjCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDscrptn)
                    .addComponent(tfDscrptn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSubj)
                    .addComponent(btnUpdSubj)
                    .addComponent(btnDelSubj)
                    .addComponent(btnExamView))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        db.close();
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void tblSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubjectMouseClicked
        if(!select) {
            Subject nth = list.get(tblSubject.getSelectedRow());
            tfSubjCode.setText(nth.getCode());
            tfDscrptn.setText(nth.getDescription());
            btnAddSubj.setEnabled(false);
            btnUpdSubj.setEnabled(true);
            btnDelSubj.setEnabled(true);
            btnExamView.setEnabled(true);
            select = true;
        } else {
            clrSubjForm();
        }
    }//GEN-LAST:event_tblSubjectMouseClicked

    private void btnAddSubjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubjActionPerformed
        try {
            if(tfSubjCode.getText().isEmpty() || tfDscrptn.getText().isEmpty()) {
                throw new Exception();
            }
            
            Subject nth = new Subject(tfSubjCode.getText(),tfDscrptn.getText());          
            DefaultTableModel dtm = (DefaultTableModel) tblSubject.getModel();
            if(!db.executeQuery("select code from "+DBHelper.SUBJECT+
                    " where code = '"+nth.getCode()+"'").first()) {
                db.add(nth);
                list.add(nth);
            }
            db.add(new SubjectTeacher(tchr.getId(),nth.getCode()));
            dtm.addRow(new Object[]{nth.getCode(),nth.getDescription()});
            clrSubjForm();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this,"Could not be added!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddSubjActionPerformed

    private void btnUpdSubjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdSubjActionPerformed
        try {
            if(tfSubjCode.getText().isEmpty() || tfDscrptn.getText().isEmpty()) {
                throw new Exception();
            }
            
            DefaultTableModel dtm = (DefaultTableModel) tblSubject.getModel();
            Subject x = new Subject(tfSubjCode.getText(), tfDscrptn.getText());
            db.execute("update "+DBHelper.SUBJECT+" set code = '"+tfSubjCode.getText()+"', description = '"+tfDscrptn.getText()+
                    "' where code = '"+dtm.getValueAt(tblSubject.getSelectedRow(),0)+"'");
            dtm.setValueAt(x.getCode(), tblSubject.getSelectedRow(), 0);
            dtm.setValueAt(x.getDescription(), tblSubject.getSelectedRow(), 1);
            list.set(tblSubject.getSelectedRow(), x);
            
            clrSubjForm();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this,"Could not be updated!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdSubjActionPerformed

    private void btnDelSubjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelSubjActionPerformed
        try {
            if(tfSubjCode.getText().isEmpty() || tfDscrptn.getText().isEmpty()) {
                throw new Exception();
            }
            
            DefaultTableModel dtm = (DefaultTableModel) tblSubject.getModel();
            db.execute("delete from "+DBHelper.SUBJECT+" where code = '"+tfSubjCode.getText()+"'");
            list.remove(tblSubject.getSelectedRow());
            dtm.removeRow(tblSubject.getSelectedRow());
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this,"Could not be deleted!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDelSubjActionPerformed

    private void btnExamViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamViewActionPerformed
        ExamViewFrame exam = new ExamViewFrame(new Subject(tfSubjCode.getText(),tfDscrptn.getText()),tchr,this);
        this.setVisible(false);
        exam.setVisible(true);
    }//GEN-LAST:event_btnExamViewActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherFrame().setVisible(true);
            }
        });
    }
    
    public void clrSubjForm() {
        tfSubjCode.setText("");
        tfDscrptn.setText("");
        tblSubject.clearSelection();
        btnAddSubj.setEnabled(true);
        btnUpdSubj.setEnabled(false);
        btnDelSubj.setEnabled(false);
        btnExamView.setEnabled(false);
        select = false;
    }
    
    Teacher tchr;
    ArrayList <Subject> list;
    DBHelper db;
    boolean select;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSubj;
    private javax.swing.JButton btnDelSubj;
    private javax.swing.JButton btnExamView;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdSubj;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbDscrptn;
    private javax.swing.JLabel lbSubjCode;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JPanel pnlTeacher;
    private javax.swing.JScrollPane sclSubject;
    private javax.swing.JTable tblSubject;
    private javax.swing.JTextField tfDscrptn;
    private javax.swing.JTextField tfSubjCode;
    // End of variables declaration//GEN-END:variables
}

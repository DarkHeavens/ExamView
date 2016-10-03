package com.teampurado.view;

import com.teampurado.model.classes.Subject;
import com.teampurado.model.classes.Teacher;
import com.teampurado.model.database.DBHelper;
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
                    " where teacherID = '"+tchr.getId()+"')"));
            
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

        pnlSubjectTeacher = new javax.swing.JPanel();
        lbSubjectTeacher = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlTeacher = new javax.swing.JPanel();
        lbAvatar = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lbWelcome = new javax.swing.JLabel();
        sclSubject = new javax.swing.JScrollPane();
        tblSubject = new javax.swing.JTable();
        lbSubject = new javax.swing.JLabel();
        tfSubject = new javax.swing.JTextField();
        lbDscrptn = new javax.swing.JLabel();
        tfDscrptn = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExamView = new javax.swing.JButton();

        lbSubjectTeacher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSubjectTeacher.setText("Subject");

        jLabel1.setText("Schedule");

        javax.swing.GroupLayout pnlSubjectTeacherLayout = new javax.swing.GroupLayout(pnlSubjectTeacher);
        pnlSubjectTeacher.setLayout(pnlSubjectTeacherLayout);
        pnlSubjectTeacherLayout.setHorizontalGroup(
            pnlSubjectTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubjectTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSubjectTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSubjectTeacher)
                    .addComponent(jLabel1))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        pnlSubjectTeacherLayout.setVerticalGroup(
            pnlSubjectTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubjectTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSubjectTeacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
        );

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
            tblSubject.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        lbSubject.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSubject.setText("Subject:");

        lbDscrptn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDscrptn.setText("Description:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExamView.setText("View Exam");

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
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExamView))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTeacherLayout.createSequentialGroup()
                        .addComponent(lbWelcome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTeacherLayout.createSequentialGroup()
                        .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbSubject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDscrptn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSubject)
                            .addComponent(tfDscrptn))))
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
                    .addComponent(lbSubject)
                    .addComponent(tfSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDscrptn)
                    .addComponent(tfDscrptn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnExamView))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void tblSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubjectMouseClicked
        if(!select) {
            Subject nth = list.get(tblSubject.getSelectedRow());
            tfSubject.setText(nth.getCode());
            tfDscrptn.setText(nth.getDescription());
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            select = true;
        } else {
            clrSubjForm();
        }
    }//GEN-LAST:event_tblSubjectMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            if(!tfSubject.getText().isEmpty() && !tfDscrptn.getText().isEmpty()) {
                throw new Exception();
            }
            
            Subject x = new Subject(tfSubject.getText(),tfDscrptn.getText());
            DefaultTableModel dtm = (DefaultTableModel) tblSubject.getModel();
            
            list.add(x);
            dtm.addRow(new Object[]{x.getCode(),x.getDescription()});
            if(!db.execute("select code from "+DBHelper.SUBJECT+
                    " where code = '"+x.getCode()+"'")) {
                db.execute("insert into from "+DBHelper.SUBJECT+" values("+x.getCode()+","+x.getDescription()+")");
            }
            
            db.execute("insert into from "+DBHelper.SUBJECT_TEACHER+" values("+")");
            
            clrSubjForm();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this,"Invalid input!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed
    
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
        tfSubject.setText("");
        tfDscrptn.setText("");
        tblSubject.clearSelection();
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        select = false;
    }
    
    Teacher tchr;
    ArrayList <Subject> list;
    DBHelper db;
    boolean select;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExamView;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbDscrptn;
    private javax.swing.JLabel lbSubject;
    private javax.swing.JLabel lbSubjectTeacher;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JPanel pnlSubjectTeacher;
    private javax.swing.JPanel pnlTeacher;
    private javax.swing.JScrollPane sclSubject;
    private javax.swing.JTable tblSubject;
    private javax.swing.JTextField tfDscrptn;
    private javax.swing.JTextField tfSubject;
    // End of variables declaration//GEN-END:variables
}

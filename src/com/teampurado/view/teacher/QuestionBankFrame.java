package com.teampurado.view.teacher;

import com.teampurado.model.classes.Exam;
import com.teampurado.model.classes.Question;
import com.teampurado.model.classes.QuestionBank;
import com.teampurado.model.database.DBHelper;
import com.teampurado.view.LoginFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ProfessorSci
 */
public class QuestionBankFrame extends javax.swing.JFrame {

    public QuestionBankFrame() {
        initComponents();
    }
    
    public QuestionBankFrame(Exam e, QuestionBank qb, String subj, ExamViewFrame evf) {
        initComponents();
        db = new DBHelper();
        this.e = e;
        this.qb = qb;
        this.evf = evf;
        
        lbUsername.setText(qb.getTeacherID());
        lbSubject.setText(subj);
        lbExamDscrptn.setText(e.getDescription());
        lbQuestionNo.setText(e.getNumOfItems()+"");
        lbTimeLimit.setText(e.getTimeLimit());
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlQuestionBank = new javax.swing.JPanel();
        lbAvatar = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lbSubject = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lbExamDscrptn = new javax.swing.JLabel();
        sclQBank = new javax.swing.JScrollPane();
        tblQBank = new javax.swing.JTable();
        lbQuestionNo = new javax.swing.JLabel();
        lbHPS = new javax.swing.JLabel();
        lbTimeLimit = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnCommit = new javax.swing.JButton();
        btnCopyTo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ExamView");

        lbAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teampurado/images/user.png"))); // NOI18N

        lbUsername.setText("username");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lbSubject.setText("Subject");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbExamDscrptn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbExamDscrptn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExamDscrptn.setText("Exam Description");

        tblQBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question No", "Number of Points", "Ask", "Answer", "Choices (choice1, choice 2, ..., choice n)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQBank.setColumnSelectionAllowed(true);
        sclQBank.setViewportView(tblQBank);
        tblQBank.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tblQBank.getColumnModel().getColumnCount() > 0) {
            tblQBank.getColumnModel().getColumn(0).setResizable(false);
            tblQBank.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblQBank.getColumnModel().getColumn(1).setResizable(false);
            tblQBank.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblQBank.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblQBank.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblQBank.getColumnModel().getColumn(4).setPreferredWidth(300);
        }

        lbQuestionNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuestionNo.setText("# Items");

        lbHPS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHPS.setText("HPS");

        lbTimeLimit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTimeLimit.setText("Time Limit");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnCommit.setText("Commit");
        btnCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommitActionPerformed(evt);
            }
        });

        btnCopyTo.setText("Copy To...");
        btnCopyTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyToActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlQuestionBankLayout = new javax.swing.GroupLayout(pnlQuestionBank);
        pnlQuestionBank.setLayout(pnlQuestionBankLayout);
        pnlQuestionBankLayout.setHorizontalGroup(
            pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuestionBankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbExamDscrptn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sclQBank, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuestionBankLayout.createSequentialGroup()
                        .addComponent(lbQuestionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbHPS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTimeLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCommit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopyTo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuestionBankLayout.createSequentialGroup()
                        .addComponent(lbSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuestionBankLayout.createSequentialGroup()
                        .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout)))
                .addContainerGap())
        );
        pnlQuestionBankLayout.setVerticalGroup(
            pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuestionBankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlQuestionBankLayout.createSequentialGroup()
                        .addGroup(pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUsername)
                            .addComponent(btnLogout))
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lbSubject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbExamDscrptn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sclQBank, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCopyTo)
                        .addComponent(btnCommit)
                        .addComponent(btnRefresh))
                    .addComponent(lbQuestionNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTimeLimit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlQuestionBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlQuestionBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommitActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblQBank.getModel();
        int hps = 0;
        
        db.execute("delete from "+DBHelper.QUESTION+" where QBankID = "+qb.getQBankID());
        for(int i = 0; i < tblQBank.getRowCount(); i++) {
            Question q = new Question((short)i,qb.getQBankID(),Byte.parseByte(dtm.getValueAt(i, 1).toString()),dtm.getValueAt(i, 2).toString(), dtm.getValueAt(i, 3).toString(), dtm.getValueAt(i, 4).toString());
            db.add(q);
            hps += q.getNumOfPoints();
        }
        lbHPS.setText(hps+"");
    }//GEN-LAST:event_btnCommitActionPerformed

    private void btnCopyToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopyToActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        db.close();
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        evf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionBankFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionBankFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionBankFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionBankFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionBankFrame().setVisible(true);
            }
        });
    }
    
    public final void refresh() {
        DefaultTableModel dtm = (DefaultTableModel) tblQBank.getModel();
        int i,hps = 0;
        
        for(i = 0; i < dtm.getRowCount();i++){
            dtm.removeRow(i);
        }
        
        try {
            db.setRs(db.executeQuery("select * from "+DBHelper.QUESTION+" where QBankID = "+qb.getQBankID()));
            while(db.getRs().next()) {
                Question nth = new Question(db.getRs().getShort("questionNo"),db.getRs().getInt("QBankID"),db.getRs().getByte("numOfPoints"),db.getRs().getString("ask"),db.getRs().getString("answer"),db.getRs().getString("choices"));
                dtm.addRow(new Object[]{nth.getQuestionNo(),nth.getNumOfPoints(),nth.getAnswer(),nth.getChoices()});
                hps += nth.getNumOfPoints();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionBankFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(i < e.getNumOfItems()) {
            dtm.addRow(new Object[]{i,"","",""});
        }
        lbHPS.setText(hps+"");
    }
    
    Exam e;
    QuestionBank qb;
    ExamViewFrame evf;
    DBHelper db;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCommit;
    private javax.swing.JButton btnCopyTo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbExamDscrptn;
    private javax.swing.JLabel lbHPS;
    private javax.swing.JLabel lbQuestionNo;
    private javax.swing.JLabel lbSubject;
    private javax.swing.JLabel lbTimeLimit;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pnlQuestionBank;
    private javax.swing.JScrollPane sclQBank;
    private javax.swing.JTable tblQBank;
    // End of variables declaration//GEN-END:variables
}

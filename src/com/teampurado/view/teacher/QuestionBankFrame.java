package com.teampurado.view.teacher;

import com.teampurado.model.classes.Exam;
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
    
    public QuestionBankFrame(Exam e, ExamViewFrame evf) {
        initComponents();
        db = new DBHelper();
        this.e = e;
        this.evf = evf;
        
        lbUsername.setText(e.getTeacherID());
        lbSubject.setText(e.getSubjectCode());
        lbExamDscrptn.setText(e.getDescription());
        lbQuestionNo.setText(e.getNumOfItems()+"");
        lbTimeLimit.setText(e.getTimeLimit());
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frInput = new javax.swing.JFrame();
        pnlInput = new javax.swing.JPanel();
        btnConfirm = new javax.swing.JButton();
        sclInput = new javax.swing.JScrollPane();
        taInput = new javax.swing.JTextArea();
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

        frInput.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        frInput.setTitle("Input Text");
        frInput.setAlwaysOnTop(true);
        frInput.setLocationByPlatform(true);
        frInput.setSize(new java.awt.Dimension(485, 385));

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        sclInput.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sclInput.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        taInput.setColumns(20);
        taInput.setLineWrap(true);
        taInput.setRows(5);
        taInput.setWrapStyleWord(true);
        sclInput.setViewportView(taInput);

        javax.swing.GroupLayout pnlInputLayout = new javax.swing.GroupLayout(pnlInput);
        pnlInput.setLayout(pnlInputLayout);
        pnlInputLayout.setHorizontalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addComponent(sclInput, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlInputLayout.setVerticalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sclInput, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frInputLayout = new javax.swing.GroupLayout(frInput.getContentPane());
        frInput.getContentPane().setLayout(frInputLayout);
        frInputLayout.setHorizontalGroup(
            frInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frInputLayout.setVerticalGroup(
            frInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frInput.getAccessibleContext().setAccessibleParent(this);

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
                "Question No", "Number of Points", "Ask", "Answer", "Choices (choice1|choice 2|...|choice n)"
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
        tblQBank.getTableHeader().setReorderingAllowed(false);
        tblQBank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQBankMouseClicked(evt);
            }
        });
        sclQBank.setViewportView(tblQBank);
        tblQBank.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
                        .addComponent(btnCommit))
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
                    .addComponent(btnCommit)
                    .addComponent(lbQuestionNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTimeLimit)
                    .addComponent(btnRefresh))
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
            
        db.execute("delete from "+DBHelper.QUESTION_BANK+" where QBankID = "+e.getExamID());
        for(int i = 0; i < tblQBank.getRowCount(); i++) {
            QuestionBank qb = new QuestionBank(e.getExamID(),(short)(i+1),Byte.parseByte(dtm.getValueAt(i, 1).toString()),dtm.getValueAt(i, 2).toString(), dtm.getValueAt(i, 3).toString(), dtm.getValueAt(i, 4).toString());
            db.execute("update "+DBHelper.QUESTION_BANK+" set numOfPoints = "+qb.getNumOfPoints()+", ask = '"+qb.getAsk()+"', answer = '"+qb.getAnswer()+"', choices = '"+qb.getChoices()+"' where QBankID = "+e.getExamID()+" and questionNo = "+qb.getQuestionNo());
            hps += qb.getNumOfPoints();    
        }
        lbHPS.setText(hps+"");
    }//GEN-LAST:event_btnCommitActionPerformed

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

    private void tblQBankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQBankMouseClicked
        if(tblQBank.getSelectedColumn() >= 2) {
            frInput.setVisible(true);
            taInput.setText(tblQBank.getValueAt(tblQBank.getSelectedRow(),tblQBank.getSelectedColumn()).toString());
            this.setEnabled(false);
        }
    }//GEN-LAST:event_tblQBankMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        tblQBank.setValueAt(taInput.getText(), tblQBank.getSelectedRow(),tblQBank.getSelectedColumn());
        frInput.setVisible(false);
        this.setEnabled(true);
    }//GEN-LAST:event_btnConfirmActionPerformed

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
            db.execute("delete from "+DBHelper.QUESTION_BANK+" where QBankID = "+e.getExamID()+" and questionNo = "+(i+1));
        }
        
        try {
            db.setRs(db.executeQuery("select * from "+DBHelper.QUESTION_BANK+" where QBankID = "+e.getExamID()));
            while(db.getRs().next()) {
                QuestionBank nth = new QuestionBank(e.getExamID(), db.getRs().getShort("questionNo"),db.getRs().getByte("numOfPoints"),db.getRs().getString("ask"),db.getRs().getString("answer"),db.getRs().getString("choices"));
                dtm.addRow(new Object[]{nth.getQuestionNo(),nth.getNumOfPoints(),nth.getAsk(),nth.getAnswer(),nth.getChoices()});
                hps += nth.getNumOfPoints();
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionBankFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(i < e.getNumOfItems()) {
            dtm.addRow(new Object[]{i+1,1,"","",""});
            db.add(new QuestionBank(e.getExamID(),(short)(i+1),Byte.parseByte(dtm.getValueAt(i, 1).toString()),"","",""));
            i++;
        }
        lbHPS.setText(hps+"");
    }
    
    Exam e;
    ExamViewFrame evf;
    DBHelper db;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCommit;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JFrame frInput;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbExamDscrptn;
    private javax.swing.JLabel lbHPS;
    private javax.swing.JLabel lbQuestionNo;
    private javax.swing.JLabel lbSubject;
    private javax.swing.JLabel lbTimeLimit;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pnlInput;
    private javax.swing.JPanel pnlQuestionBank;
    private javax.swing.JScrollPane sclInput;
    private javax.swing.JScrollPane sclQBank;
    private javax.swing.JTextArea taInput;
    private javax.swing.JTable tblQBank;
    // End of variables declaration//GEN-END:variables
}

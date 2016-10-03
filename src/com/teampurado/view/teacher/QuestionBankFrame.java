package com.teampurado.view.teacher;

/**
 *
 * @author ProfessorSci
 */
public class QuestionBankFrame extends javax.swing.JFrame {

    public QuestionBankFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlQuestionBank = new javax.swing.JPanel();
        lbAvatar = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lbTimeLimit = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lbExamDscrptn = new javax.swing.JLabel();
        sclQBank = new javax.swing.JScrollPane();
        tblQBank = new javax.swing.JTable();
        lbQuestionNo = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnCommit = new javax.swing.JButton();
        btnCopyTo = new javax.swing.JButton();
        lbHPS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ExamView");

        lbAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teampurado/images/user.png"))); // NOI18N

        lbUsername.setText("username");

        btnLogout.setText("Logout");

        lbTimeLimit.setText("Time Limit");

        btnBack.setText("Back");

        lbExamDscrptn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbExamDscrptn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExamDscrptn.setText("Exam Description");

        tblQBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question No", "Number of Points", "Answer", "Choices (choice1, choice 2, ..., choice n)"
            }
        ));
        tblQBank.setColumnSelectionAllowed(true);
        sclQBank.setViewportView(tblQBank);
        tblQBank.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tblQBank.getColumnModel().getColumnCount() > 0) {
            tblQBank.getColumnModel().getColumn(0).setResizable(false);
            tblQBank.getColumnModel().getColumn(0).setPreferredWidth(95);
            tblQBank.getColumnModel().getColumn(1).setResizable(false);
            tblQBank.getColumnModel().getColumn(1).setPreferredWidth(130);
            tblQBank.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblQBank.getColumnModel().getColumn(3).setPreferredWidth(300);
        }

        lbQuestionNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuestionNo.setText("# Q/# Items");

        btnRefresh.setText("Refresh");

        btnCommit.setText("Commit");

        btnCopyTo.setText("Copy To...");

        lbHPS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHPS.setText("HPS");

        javax.swing.GroupLayout pnlQuestionBankLayout = new javax.swing.GroupLayout(pnlQuestionBank);
        pnlQuestionBank.setLayout(pnlQuestionBankLayout);
        pnlQuestionBankLayout.setHorizontalGroup(
            pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuestionBankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbExamDscrptn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sclQBank)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuestionBankLayout.createSequentialGroup()
                        .addComponent(lbQuestionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbHPS, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCommit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopyTo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuestionBankLayout.createSequentialGroup()
                        .addComponent(lbTimeLimit)
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
                    .addComponent(lbTimeLimit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbExamDscrptn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sclQBank, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlQuestionBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopyTo)
                    .addComponent(btnCommit)
                    .addComponent(btnRefresh)
                    .addComponent(lbHPS)
                    .addComponent(lbQuestionNo))
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
    private javax.swing.JLabel lbTimeLimit;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pnlQuestionBank;
    private javax.swing.JScrollPane sclQBank;
    private javax.swing.JTable tblQBank;
    // End of variables declaration//GEN-END:variables
}

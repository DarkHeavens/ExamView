package com.teampurado.view.teacher;

/**
 *
 * @author ProfessorSci
 */
public class ExamViewFrame extends javax.swing.JFrame {

    public ExamViewFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlExam = new javax.swing.JPanel();
        lbAvatar = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lbSubject = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lbExam = new javax.swing.JLabel();
        sclSubject = new javax.swing.JScrollPane();
        tblSubject = new javax.swing.JTable();
        pnlExam_QBank = new javax.swing.JPanel();
        lbQBank = new javax.swing.JLabel();
        sclQBank = new javax.swing.JScrollPane();
        tblQBank = new javax.swing.JTable();
        lbLog = new javax.swing.JLabel();
        btnAddQBank = new javax.swing.JButton();
        btnUpdQBank = new javax.swing.JButton();
        btnDelQBank = new javax.swing.JButton();
        lbExamDscrptn = new javax.swing.JLabel();
        tfExamDscrptn = new javax.swing.JTextField();
        lbNumOfItems = new javax.swing.JLabel();
        spnNumOfItems = new javax.swing.JSpinner();
        lbTimeLimit = new javax.swing.JLabel();
        spnHr = new javax.swing.JSpinner();
        lbHr = new javax.swing.JLabel();
        spnMin = new javax.swing.JSpinner();
        lbMin = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        btnAddExam = new javax.swing.JButton();
        btnUpdExam = new javax.swing.JButton();
        btnDelExam = new javax.swing.JButton();
        btnViewQBank = new javax.swing.JButton();

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

        lbExam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbExam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExam.setText("Exam");

        tblSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Created", "Schedule", "Description", "Number of Items", "Time Limit", "Password", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sclSubject.setViewportView(tblSubject);

        pnlExam_QBank.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lbQBank.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbQBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQBank.setText("Question Bank");

        tblQBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam Description"
            }
        ));
        sclQBank.setViewportView(tblQBank);

        btnAddQBank.setText("Add Question Bank");

        btnUpdQBank.setText("Update Question Bank");

        btnDelQBank.setText("Delete Question Bank");

        lbExamDscrptn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbExamDscrptn.setText("Exam Description:");

        lbNumOfItems.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNumOfItems.setText("Number of Items:");

        spnNumOfItems.setModel(new javax.swing.SpinnerNumberModel((short)5, null, null, (short)1));

        lbTimeLimit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTimeLimit.setText("Time Limit:");

        spnHr.setModel(new javax.swing.SpinnerNumberModel((byte)0, null, (byte)99, (byte)1));

        lbHr.setText("h");

        spnMin.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)1), Byte.valueOf((byte)1), Byte.valueOf((byte)59), Byte.valueOf((byte)1)));

        lbMin.setText("min");

        lbPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPassword.setText("Password:");

        btnAddExam.setText("Add Exam");

        btnUpdExam.setText("Update Exam");

        btnDelExam.setText("Delete Exam");

        btnViewQBank.setText("View Question Bank");

        javax.swing.GroupLayout pnlExam_QBankLayout = new javax.swing.GroupLayout(pnlExam_QBank);
        pnlExam_QBank.setLayout(pnlExam_QBankLayout);
        pnlExam_QBankLayout.setHorizontalGroup(
            pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbQBank, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(sclQBank, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUpdQBank, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelQBank, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddQBank, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExam_QBankLayout.createSequentialGroup()
                                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNumOfItems, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbExamDscrptn)
                                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                                        .addComponent(spnNumOfItems, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbTimeLimit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnHr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbHr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbMin))
                                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfExamDscrptn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExam_QBankLayout.createSequentialGroup()
                                .addComponent(btnViewQBank)
                                .addGap(74, 74, 74)))
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlExam_QBankLayout.setVerticalGroup(
            pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbQBank)
                    .addComponent(lbLog, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfExamDscrptn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddExam))
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdExam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelExam))
                            .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnNumOfItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTimeLimit)
                                    .addComponent(spnHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbHr)
                                    .addComponent(spnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewQBank)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbExamDscrptn)
                                    .addComponent(btnAddQBank))
                                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                                        .addComponent(lbNumOfItems)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbPassword))
                                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdQBank)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelQBank))))
                            .addComponent(sclQBank, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout pnlExamLayout = new javax.swing.GroupLayout(pnlExam);
        pnlExam.setLayout(pnlExamLayout);
        pnlExamLayout.setHorizontalGroup(
            pnlExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbExam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlExamLayout.createSequentialGroup()
                        .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addComponent(sclSubject, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlExamLayout.createSequentialGroup()
                        .addComponent(lbSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(pnlExam_QBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlExamLayout.setVerticalGroup(
            pnlExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExamLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlExamLayout.createSequentialGroup()
                        .addGroup(pnlExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogout)
                            .addComponent(lbUsername))
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSubject)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbExam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sclSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlExam_QBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(ExamViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamViewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExam;
    private javax.swing.JButton btnAddQBank;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelExam;
    private javax.swing.JButton btnDelQBank;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdExam;
    private javax.swing.JButton btnUpdQBank;
    private javax.swing.JButton btnViewQBank;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbExam;
    private javax.swing.JLabel lbExamDscrptn;
    private javax.swing.JLabel lbHr;
    private javax.swing.JLabel lbLog;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbNumOfItems;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbQBank;
    private javax.swing.JLabel lbSubject;
    private javax.swing.JLabel lbTimeLimit;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pnlExam;
    private javax.swing.JPanel pnlExam_QBank;
    private javax.swing.JScrollPane sclQBank;
    private javax.swing.JScrollPane sclSubject;
    private javax.swing.JSpinner spnHr;
    private javax.swing.JSpinner spnMin;
    private javax.swing.JSpinner spnNumOfItems;
    private javax.swing.JTable tblQBank;
    private javax.swing.JTable tblSubject;
    private javax.swing.JTextField tfExamDscrptn;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}

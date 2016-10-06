package com.teampurado.view.teacher;

import com.teampurado.model.classes.Exam;
import com.teampurado.model.classes.Subject;
import com.teampurado.model.classes.Teacher;
import com.teampurado.model.database.DBHelper;
import com.teampurado.view.LoginFrame;
import com.teampurado.view.TeacherFrame;
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
public class ExamViewFrame extends javax.swing.JFrame {

    public ExamViewFrame() {
        initComponents();
    }
    
    public ExamViewFrame(Subject subj, Teacher tchr, TeacherFrame tf) {
        initComponents();
        db = new DBHelper();
        this.subj = subj;
        this.tchr = tchr;
        this.tf = tf;
        list = new ArrayList();
        lbUsername.setText(tchr.getId());
        lbSubject.setText(subj.getCode());
        select = false;
        
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblExam.getModel();
            db.setRs(db.executeQuery("select * from "+DBHelper.EXAM+
                    " where teacherID = "+tchr.getId()+
                    " and subjectCode = '"+subj.getCode()+"'"));
            while(db.getRs().next()) {
                Exam nth = new Exam(db.getRs().getByte("examID"),db.getRs().getString("teacherID"),db.getRs().getString("subjectCode"),db.getRs().getString("description"),db.getRs().getShort("numOfItems"),db.getRs().getString("timeLimit"),db.getRs().getString("password"),db.getRs().getBoolean("status"));
                dtm.addRow(new Object[]{db.getRs().getString("Description"),
                    nth.getNumOfItems(),nth.getTimeLimit(),nth.getPassword(),nth.isStatus()});
                list.add(nth);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpStatus = new javax.swing.ButtonGroup();
        pnlExam = new javax.swing.JPanel();
        lbAvatar = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lbSubject = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lbExam = new javax.swing.JLabel();
        sclExam = new javax.swing.JScrollPane();
        tblExam = new javax.swing.JTable();
        pnlExam_QBank = new javax.swing.JPanel();
        btnViewQBank = new javax.swing.JButton();
        rbOpen = new javax.swing.JRadioButton();
        rbClose = new javax.swing.JRadioButton();
        btnViewAttempt = new javax.swing.JButton();
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

        lbExam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbExam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExam.setText("Exam");

        tblExam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Number of Items", "Time Limit", "Password", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExamMouseClicked(evt);
            }
        });
        sclExam.setViewportView(tblExam);
        if (tblExam.getColumnModel().getColumnCount() > 0) {
            tblExam.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblExam.getColumnModel().getColumn(1).setPreferredWidth(1);
            tblExam.getColumnModel().getColumn(2).setPreferredWidth(1);
            tblExam.getColumnModel().getColumn(3).setPreferredWidth(1);
            tblExam.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        pnlExam_QBank.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnViewQBank.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnViewQBank.setText("View Question Bank");
        btnViewQBank.setEnabled(false);
        btnViewQBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewQBankActionPerformed(evt);
            }
        });

        btnGrpStatus.add(rbOpen);
        rbOpen.setSelected(true);
        rbOpen.setText("Close");

        btnGrpStatus.add(rbClose);
        rbClose.setText("Open");

        btnViewAttempt.setText("View Attempt");
        btnViewAttempt.setEnabled(false);
        btnViewAttempt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAttemptActionPerformed(evt);
            }
        });

        lbExamDscrptn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbExamDscrptn.setText("Exam Description:");

        lbNumOfItems.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNumOfItems.setText("Number of Items:");

        spnNumOfItems.setModel(new javax.swing.SpinnerNumberModel((short)5, null, null, (short)1));

        lbTimeLimit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTimeLimit.setText("Time Limit:");

        spnHr.setModel(new javax.swing.SpinnerNumberModel((byte)0, null, (byte)99, (byte)1));

        lbHr.setText("h");

        spnMin.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)1), Byte.valueOf((byte)0), Byte.valueOf((byte)59), Byte.valueOf((byte)1)));

        lbMin.setText("min");

        lbPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPassword.setText("Password:");

        btnAddExam.setText("Add Exam");
        btnAddExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExamActionPerformed(evt);
            }
        });

        btnUpdExam.setText("Update Exam");
        btnUpdExam.setEnabled(false);
        btnUpdExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdExamActionPerformed(evt);
            }
        });

        btnDelExam.setText("Delete Exam");
        btnDelExam.setEnabled(false);
        btnDelExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelExamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExam_QBankLayout = new javax.swing.GroupLayout(pnlExam_QBank);
        pnlExam_QBank.setLayout(pnlExam_QBankLayout);
        pnlExam_QBankLayout.setHorizontalGroup(
            pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewQBank, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbExamDscrptn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNumOfItems, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(tfExamDscrptn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                        .addComponent(rbClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOpen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAttempt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlExam_QBankLayout.setVerticalGroup(
            pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                        .addComponent(btnViewQBank, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlExam_QBankLayout.createSequentialGroup()
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewAttempt)
                            .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbOpen)
                                .addComponent(rbClose)))
                        .addGap(17, 17, 17)
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfExamDscrptn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbExamDscrptn)
                            .addComponent(btnAddExam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnNumOfItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTimeLimit)
                            .addComponent(spnHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHr)
                            .addComponent(spnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMin)
                            .addComponent(lbNumOfItems)
                            .addComponent(btnUpdExam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlExam_QBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPassword)
                            .addComponent(btnDelExam))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(sclExam, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlExamLayout.createSequentialGroup()
                        .addComponent(lbSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(pnlExam_QBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(sclExam, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tblExamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExamMouseClicked
        if(!select) {
            Exam nth = list.get(tblExam.getSelectedRow());
            tfExamDscrptn.setText(nth.getDescription());
            spnNumOfItems.setValue(nth.getNumOfItems());
            spnHr.setValue(extractTime(nth.getTimeLimit().substring(0,2)));
            spnMin.setValue(extractTime(nth.getTimeLimit().substring(3,5)));
            tfPassword.setText(nth.getPassword());
            if(nth.isStatus()) {
                rbOpen.setSelected(true);
            } else {
                rbClose.setSelected(true);
            }
            
            btnAddExam.setEnabled(false);
            btnUpdExam.setEnabled(true);
            btnDelExam.setEnabled(true);
            btnViewAttempt.setEnabled(true);
            btnViewQBank.setEnabled(true);
            select = true;
        } else {
            clrForm();
        }
    }//GEN-LAST:event_tblExamMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        tf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewAttemptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAttemptActionPerformed
        AttemptViewFrame avf = new AttemptViewFrame(list.get(tblExam.getSelectedRow()), this);
        this.setVisible(false);
        avf.setVisible(true);
    }//GEN-LAST:event_btnViewAttemptActionPerformed

    private void btnViewQBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewQBankActionPerformed
        Exam nth = list.get(tblExam.getSelectedRow());
        
        QuestionBankFrame qbf = new QuestionBankFrame(nth,this);
        qbf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewQBankActionPerformed

    private void btnAddExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExamActionPerformed
        try {
            if("".equals(tfExamDscrptn.getText()) || "".equals(tfPassword.getText()) || 
                    spnHr.getValue().toString().equals("0") && spnMin.getValue().toString().equals("0")) {
                throw new Exception();
            }
            
            Exam nth = new Exam(tchr.getId(), subj.getCode(), 
                    tfExamDscrptn.getText(), Byte.parseByte(spnNumOfItems.getValue().toString()), 
                    formatTime(Byte.parseByte(spnHr.getValue().toString()),Byte.parseByte(spnMin.getValue().toString())), 
                    tfPassword.getText(), rbOpen.isSelected());
            DefaultTableModel dtm = (DefaultTableModel) tblExam.getModel();
            dtm.addRow(new Object[]{nth.getDescription(),nth.getNumOfItems(),nth.getTimeLimit(),nth.getPassword(),(nth.isStatus()?"Open":"Close")});
            db.add(nth);
            list.add(nth);
            
            clrForm();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this,"Could not be added!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddExamActionPerformed

    private void btnUpdExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdExamActionPerformed
        try {
            if("".equals(tfExamDscrptn.getText()) || "".equals(tfPassword.getText()) || 
                    spnHr.getValue().toString().equals("0") && spnMin.getValue().toString().equals("0")) {
                throw new Exception();
            }
            
            Exam nth = new Exam(tchr.getId(), subj.getCode(), 
                    tfExamDscrptn.getText(), Byte.parseByte(spnNumOfItems.getValue().toString()), 
                    formatTime(Byte.parseByte(spnHr.getValue().toString()),Byte.parseByte(spnMin.getValue().toString())), 
                    tfPassword.getText(), rbOpen.isSelected());
            DefaultTableModel dtm = (DefaultTableModel) tblExam.getModel();
            list.set(tblExam.getSelectedRow(), nth);
            dtm.setValueAt(nth.getDescription(), tblExam.getSelectedRow(), 0);
            dtm.setValueAt(nth.getNumOfItems(), tblExam.getSelectedRow(), 1);
            dtm.setValueAt(nth.getTimeLimit(), tblExam.getSelectedRow(), 2);
            dtm.setValueAt(nth.getPassword(), tblExam.getSelectedRow(), 3);
            dtm.setValueAt((nth.isStatus()?"Open":"Close"), tblExam.getSelectedRow(), 4);
            db.execute("update "+DBHelper.EXAM+" set description = '"+nth.getDescription()+
                    "', numOfItems = "+nth.getNumOfItems()+", timeLimit = '"+nth.getTimeLimit()+
                    "', password = '"+nth.getPassword()+"', status = "+nth.isStatus()+
                    " where examID = "+nth.getExamID());
            
            clrForm();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,"Could not be updated!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdExamActionPerformed

    private void btnDelExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelExamActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblExam.getModel();
            db.execute("delete from "+DBHelper.EXAM+" where examID = "+list.get(tblExam.getSelectedRow()).getExamID());
            list.remove(tblExam.getSelectedRow());
            dtm.removeRow(tblExam.getSelectedRow());
            
            clrForm();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,"Could not be deleted!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDelExamActionPerformed

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
    
    String formatTime(byte h, byte min) {
        String time = "";
        
        if(h < 10) {
            time += "0";
        }
        time += (h + ":");
        if(min < 10) {
            time += "0";
        }
        time += (min + ":00");
        
        return time;
    }
    
    Byte extractTime(String s) {
        return Byte.parseByte(s);
    }
    
    void clrForm() {
        tblExam.clearSelection();
        tfExamDscrptn.setText("");
        tfPassword.setText("");
        spnHr.setValue(0);
        spnMin.setValue(1);
        btnViewQBank.setEnabled(false);
        btnAddExam.setEnabled(true);
        btnUpdExam.setEnabled(false);
        btnDelExam.setEnabled(false);
        btnViewAttempt.setEnabled(false);
        btnGrpStatus.clearSelection();
        select = false;
    }
    
    Subject subj;
    Teacher tchr;
    DBHelper db;
    TeacherFrame tf;
    boolean select;
    ArrayList<Exam> list;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExam;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelExam;
    private javax.swing.ButtonGroup btnGrpStatus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdExam;
    private javax.swing.JButton btnViewAttempt;
    private javax.swing.JButton btnViewQBank;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbExam;
    private javax.swing.JLabel lbExamDscrptn;
    private javax.swing.JLabel lbHr;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbNumOfItems;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSubject;
    private javax.swing.JLabel lbTimeLimit;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pnlExam;
    private javax.swing.JPanel pnlExam_QBank;
    private javax.swing.JRadioButton rbClose;
    private javax.swing.JRadioButton rbOpen;
    private javax.swing.JScrollPane sclExam;
    private javax.swing.JSpinner spnHr;
    private javax.swing.JSpinner spnMin;
    private javax.swing.JSpinner spnNumOfItems;
    private javax.swing.JTable tblExam;
    private javax.swing.JTextField tfExamDscrptn;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}

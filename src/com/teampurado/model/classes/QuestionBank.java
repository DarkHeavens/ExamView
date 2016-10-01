package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class QuestionBank {
    
    private int QBankID;
    private String examID;

    public QuestionBank(int QBankID, String examID) {
        this.QBankID = QBankID;
        this.examID = examID;
    }

    public int getQBankID() {
        return QBankID;
    }

    public void setQBankID(int QBankID) {
        this.QBankID = QBankID;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }
    
}

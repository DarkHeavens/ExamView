package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class QuestionBank {
    
    private int qBankID;
    private String examID;

    public QuestionBank(int qBankID, String examID) {
        this.qBankID = qBankID;
        this.examID = examID;
    }

    public int getqBankID() {
        return qBankID;
    }

    public void setqBankID(int qBankID) {
        this.qBankID = qBankID;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }
    
}

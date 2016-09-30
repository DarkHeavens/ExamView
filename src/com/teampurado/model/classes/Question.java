package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class Question {
    
    private short questionNo;
    private int qBankID;
    private byte numOfPoints;
    private String type;
    private String answer;
    private String choices;

    public Question(short questionNo, int qBankID, byte numOfPoints, String type, String answer, String choices) {
        this.questionNo = questionNo;
        this.qBankID = qBankID;
        this.numOfPoints = numOfPoints;
        this.type = type;
        this.answer = answer;
        this.choices = choices;
    }

    public short getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(short questionNo) {
        this.questionNo = questionNo;
    }

    public int getqBankID() {
        return qBankID;
    }

    public void setqBankID(int qBankID) {
        this.qBankID = qBankID;
    }

    public byte getNumOfPoints() {
        return numOfPoints;
    }

    public void setNumOfPoints(byte numOfPoints) {
        this.numOfPoints = numOfPoints;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }
    
}

package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class Question {
    
    private short questionNo;
    private int QBankID;
    private byte numOfPoints;
    private String ask;
    private String answer;
    private String choices;

    public Question(short questionNo, int QBankID, byte numOfPoints, String ask, String answer, String choices) {
        this.questionNo = questionNo;
        this.QBankID = QBankID;
        this.numOfPoints = numOfPoints;
        this.ask = ask;
        this.answer = answer;
        this.choices = choices;
    }

    public short getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(short questionNo) {
        this.questionNo = questionNo;
    }

    public int getQBankID() {
        return QBankID;
    }

    public void setqBankID(int QBankID) {
        this.QBankID = QBankID;
    }

    public byte getNumOfPoints() {
        return numOfPoints;
    }

    public void setNumOfPoints(byte numOfPoints) {
        this.numOfPoints = numOfPoints;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
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

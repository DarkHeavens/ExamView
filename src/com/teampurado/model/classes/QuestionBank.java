package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class QuestionBank {
    
    private byte QBankID;
    private short questionNo;
    private byte numOfPoints;
    private String ask;
    private String answer;
    private String choices;

    public QuestionBank(byte QBankID, short questionNo, byte numOfPoints, String ask, String answer, String choices) {
        this.QBankID = QBankID;
        this.questionNo = questionNo;
        this.numOfPoints = numOfPoints;
        this.ask = ask;
        this.answer = answer;
        this.choices = choices;
    }

    public QuestionBank(short questionNo, byte numOfPoints, String ask, String answer, String choices) {
        this.questionNo = questionNo;
        this.numOfPoints = numOfPoints;
        this.ask = ask;
        this.answer = answer;
        this.choices = choices;
    }

    public byte getQBankID() {
        return QBankID;
    }

    public void setQBankID(byte QBankID) {
        this.QBankID = QBankID;
    }

    public short getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(short questionNo) {
        this.questionNo = questionNo;
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

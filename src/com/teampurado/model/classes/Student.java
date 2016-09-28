package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class Student {
    private String studentID;
    private String name;
    private String pass;

    public Student(String studentID, String name, String pass) {
        this.studentID = studentID;
        this.name = name;
        this.pass = pass;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
    
    
}

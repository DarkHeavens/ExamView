package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class Student {
    
    private String studentID;
    private String name;
    private String password;

    public Student(String studentID, String name, String password) {
        this.studentID = studentID;
        this.name = name;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

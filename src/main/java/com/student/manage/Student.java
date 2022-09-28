package com.student.manage;

public class Student {
    private int studentID;
    private String StudentName;
    private String StudentPhone;
    private String studentCity;

    public Student(int studentID, String studentName, String studentPhone, String studentCity) {
        super();
        this.studentID = studentID;
        this.StudentName = studentName;
        this.StudentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(String studentName, String studentPhone, String studentCity) {
        super();
        this.StudentName = studentName;
        this.StudentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student() {
        super();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentPhone() {
        return StudentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        StudentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", StudentName='" + StudentName + '\'' +
                ", StudentPhone='" + StudentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }


}

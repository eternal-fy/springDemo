package com.ld.entity;


public class StudentDemo {
    Integer sco;
    String StudentName;
    Integer StudentAge;

    public StudentDemo() {
    }

    public StudentDemo(Integer sco, String studentName, Integer studentAge) {
        this.sco = sco;
        StudentName = studentName;
        StudentAge = studentAge;
    }

    public Integer getSco() {
        return sco;
    }

    public void setSco(Integer sco) {
        this.sco = sco;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Integer getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(Integer studentAge) {
        StudentAge = studentAge;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "sco=" + sco +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAge=" + StudentAge +
                '}';
    }
}

package com.ioay.javasamples.examples.equalsandstringsample.model;

public class Student {

    private int studentNo;
    private String studentName;

    public Student() {
    }

    public Student(int studentNo, String studentName) {
        this.studentNo = studentNo;
        this.studentName = studentName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "studentNo =" + studentNo +
               ", studentName = " + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (studentNo == ((Student)obj).getStudentNo()){
            return true;
        }else{
            return false;
        }
    }
}

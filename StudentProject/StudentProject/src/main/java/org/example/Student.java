package org.example;

public class Student {
    public enum Grade {
        A,B,C,D,E,F
    }

    private String name;
    private Grade grade;
    private int group;
    private final String secretNickName = "MySecretNickName";

    public Student(String name, Grade grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public Grade getGrade(){
        return this.grade;
    }
    public void upGradeStudentGrade() {
    }
    public void downGradeStudentGrade(){

    }
    public String getName(){
        return this.name;
    }


}

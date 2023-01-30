package org.example;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("fred", Student.Grade.A, 3);
        student1.upGradeStudentGrade();
        Student.Grade gr1 = student1.getGrade();

        Student student2 = new Student("fred", Student.Grade.B, 3);
        student2.upGradeStudentGrade();
        Student.Grade gr2 = student2.getGrade();

        Student student3 = new Student("fred", Student.Grade.F, 3);
        student3.upGradeStudentGrade();
        Student.Grade gr3 = student3.getGrade();


        Student student4 = new Student("fred", Student.Grade.A, 3);
        student4.downGradeStudentGrade();
        Student.Grade gr4 = student4.getGrade();

        Student student5 = new Student("fred", Student.Grade.C, 3);
        student5.downGradeStudentGrade();
        Student.Grade gr5 = student5.getGrade();

        Student student6 = new Student("fred", Student.Grade.F, 3);
        student6.downGradeStudentGrade();
        Student.Grade gr6 = student6.getGrade();


        // causes exception
        // Student student3 = new Student("fred", Student.Grade.A, 10);


    }
}
package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getGrade() {
        Student student = new Student("fred", Student.Grade.A, 2);
        Student.Grade grade = student.getGrade();
        assertEquals(grade, Student.Grade.A);
    }

    @Test
    void upGradeStudentGrade() {
        Student student1 = new Student("fred", Student.Grade.A, 3);
        student1.upGradeStudentGrade();
        Student.Grade gr1 = student1.getGrade();
        assertEquals(gr1, Student.Grade.A);

        Student student2 = new Student("fred", Student.Grade.B, 3);
        student2.upGradeStudentGrade();
        Student.Grade gr2 = student2.getGrade();
        assertEquals(gr2, Student.Grade.A);

        Student student3 = new Student("fred", Student.Grade.F, 3);
        student3.upGradeStudentGrade();
        Student.Grade gr3 = student3.getGrade();
        assertEquals(gr3, Student.Grade.E);
    }

    @Test
    void downGradeStudentGrade() {
        Student student4 = new Student("fred", Student.Grade.A, 3);
        student4.downGradeStudentGrade();
        Student.Grade gr4 = student4.getGrade();
        assertEquals(gr4, Student.Grade.B);

        Student student5 = new Student("fred", Student.Grade.C, 3);
        student5.downGradeStudentGrade();
        Student.Grade gr5 = student5.getGrade();
        assertEquals(gr5, Student.Grade.D);

        Student student6 = new Student("fred", Student.Grade.F, 3);
        student6.downGradeStudentGrade();
        Student.Grade gr6 = student6.getGrade();
        assertEquals(gr6, Student.Grade.F);

    }

    @Test
    void getName() {
        Student student7 = new Student("fred", Student.Grade.F, 3);
        String name = student7.getName();
        assertEquals(name, "fred");
    }

}
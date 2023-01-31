package org.example;

import org.junit.jupiter.api.Test;

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
    }

    @Test
    void downGradeStudentGrade() {
    }

    @Test
    void getName() {
    }
}
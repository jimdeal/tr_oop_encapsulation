package org.example;

public class Student {
    public enum Grade {
        A,B,C,D,E,F;


        private static final Grade[] vals = values();

        public Grade getPrevious() {
            return vals[(this.ordinal() + 1) % vals.length];
        }
        public Grade getNext() {
            return vals[(this.ordinal() - 1) % vals.length];
        }
    }

    private final int UPPER_GROUP = 5;
    private final int LOWER_GROUP = 0;

    private String name;
    private Grade grade;
    private int group;
    private final String secretNickName = "MySecretNickName";

    public Student(String name, Grade grade, int group) {
        this.name = name;
        if(!checkGrade(grade)){
            throw new IllegalArgumentException("Invalid Grade");
        } else {
            this.grade = grade;

        }
        if(!checkGroup(group)){
            throw new IllegalArgumentException("Invalid Group");
        } else {
            this.group = group;
        }
    }

    private boolean checkGrade(Grade grade){
        boolean ret = false;
        for (Grade gradIt : Grade.values()) {
            if(grade==gradIt)
            {
                ret = true;
            }
        }
        return ret;
    }

    private boolean checkGroup(int group){
        return ((group>LOWER_GROUP)&&(group<UPPER_GROUP));
    }


    public Grade getGrade(){
        return this.grade;
    }
    public void upGradeStudentGrade() {
        if(this.grade != Grade.A){
            Grade nextGrade =  grade.getNext();
            this.grade = nextGrade;
        }
    }
    public void downGradeStudentGrade(){
        if(this.grade != Grade.F){
            Grade previousGrade =  grade.getPrevious();
            this.grade = previousGrade;
        }
    }
    public String getName(){
        return this.name;
    }


}

package com.siit.webapp;

import java.util.Comparator;

public class StudentGrades {
    private final Student s;
    private int gradeMath;
    private int gradeEnglish;
    private int gradeScience;

    private int average;



    public StudentGrades(Student s, int gradeMath,int gradeEnglish,int gradeScience) {
        this.s = s;
        this.gradeMath=gradeMath;
        this.gradeEnglish=gradeEnglish;
        this.gradeScience=gradeScience;
    }

    public int studentAverage(){
        average=(gradeEnglish+gradeMath+gradeScience)/3;
        return average;
    }



    public Student getS() {
        return s;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(int gradeMath) {
        this.gradeMath = gradeMath;
    }

    public int getGradeEnglish() {
        return gradeEnglish;
    }

    public void setGradeEnglish(int gradeEnglish) {
        this.gradeEnglish = gradeEnglish;
    }

    public int getGradeScience() {
        return gradeScience;
    }

    public void setGradeScience(int gradeScience) {
        this.gradeScience = gradeScience;
    }




    @Override
    public String toString() {
        return  s +
                ", GradeMath=" + gradeMath +
                ", GradeEnglish=" + gradeEnglish +
                ", GradeScience=" + gradeScience ;
    }
}

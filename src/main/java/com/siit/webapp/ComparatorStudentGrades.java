package com.siit.webapp;

import java.util.Comparator;

public class ComparatorStudentGrades implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b)
    {
        return (int) (b.getAverage()- a.getAverage());
    }
}



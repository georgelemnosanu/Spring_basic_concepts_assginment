package com.siit.webapp;

import java.util.Comparator;

public class ComparatorStudentGrades implements Comparator<StudentGrades> {
    @Override
    public int compare(StudentGrades a, StudentGrades b) {
        return b.studentAverage() - a.studentAverage();
    }
}



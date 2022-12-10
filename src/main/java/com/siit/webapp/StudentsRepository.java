package com.siit.webapp;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentsRepository {

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Mihai", "Pop");
        Student student2 = new Student("Roxana", "Dobre");
        Student student3 = new Student("Vali", "Topescu");
        Student student4 = new Student("George", "Lemnosanu");
        Student student5 = new Student("Andrei", "Mihai");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        return studentList;
    }

    public List<StudentGrades> getGrades(){
       List<StudentGrades> studentGradesList = new ArrayList<>();
        StudentGrades student1 = new StudentGrades(getStudents().get(0),10,6,9);
        StudentGrades student2 = new StudentGrades(getStudents().get(1),5,7,4);
        StudentGrades student3 = new StudentGrades(getStudents().get(2),9,8,7);
        StudentGrades student4 = new StudentGrades(getStudents().get(3),10,10,10);
        StudentGrades student5 = new StudentGrades(getStudents().get(4),5,6,4);
        studentGradesList.add(student1);
        studentGradesList.add(student2);
        studentGradesList.add(student3);
        studentGradesList.add(student4);
        studentGradesList.add(student5);
        return studentGradesList;
    }




}

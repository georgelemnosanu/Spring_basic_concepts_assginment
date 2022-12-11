package com.siit.webapp;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentsRepository {

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Mihai", "Pop", Arrays.asList(5, 9, 3));
        Student student2 = new Student("Roxana", "Dobre", Arrays.asList(5, 9, 4));
        Student student3 = new Student("Vali", "Topescu", Arrays.asList(5, 9, 7));
        Student student4 = new Student("George", "Lemnosanu", Arrays.asList(5, 9, 3));
        Student student5 = new Student("Andrei", "Mihai", Arrays.asList(5, 9, 5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        return studentList;
    }


}

package com.siit.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CatalogueService {

    @Autowired
    public CatalogueService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    private final StudentsRepository studentsRepository;

    public String createStudentCatalogue() {
        List<Student> studentListToBeProcessed = studentsRepository.getStudents();
        String result = "";


        for (Student student : studentListToBeProcessed) {
            result = result.concat(student.toString().concat("<br></br>"));
        }

        return result;
    }


    public String createStudentGradesCatalogue() {
        List<StudentGrades> studentGradesToBeProcessed = studentsRepository.getGrades();
        String resultGrades = "";
        int average = 0;
        Collections.sort(studentGradesToBeProcessed, new ComparatorStudentGrades() {
        });
        for (StudentGrades s : studentGradesToBeProcessed) {
            average = s.studentAverage();
            resultGrades = resultGrades.concat(s.toString().concat(", Average=").concat(String.valueOf(average)).concat("<br></br>"));
        }

        return resultGrades;
    }


}






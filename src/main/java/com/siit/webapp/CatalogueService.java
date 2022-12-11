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

            result = result.concat(student.getFirstName().concat("  ").concat(student.getLastName()).concat("<br></br>"));
        }

        return result;
    }

    public String createStudentGradeCatalogue() {
        List<Student> studentListToBeProcessed = studentsRepository.getStudents();
        String resultFinal = "";
        Collections.sort(studentListToBeProcessed, new ComparatorStudentGrades() {
        });
        for (Student student : studentListToBeProcessed) {
            student.getAverage();
            resultFinal = resultFinal.concat(student.toString().concat("<br></br>"));
        }

        return resultFinal;
    }
}









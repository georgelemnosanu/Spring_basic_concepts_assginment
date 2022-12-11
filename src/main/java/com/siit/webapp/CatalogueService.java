package com.siit.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.*;

@Service
public class CatalogueService {

    @Autowired
    public CatalogueService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    private final StudentsRepository studentsRepository;

    public String createStudentCatalogue() throws FileNotFoundException {
        String studentListToBeProcessed = studentsRepository.studentList();

        return studentListToBeProcessed ;
    }



}






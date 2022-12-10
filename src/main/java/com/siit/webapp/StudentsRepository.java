package com.siit.webapp;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@Repository
public class StudentsRepository {


    public String studentList() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\csvStudents.csv"));
        String result="";
        sc.useDelimiter(" , ");
        while (sc.hasNext())
        {
            result=sc.next();
            System.out.print(result);
        }
        sc.close();
        return result;
    }
}







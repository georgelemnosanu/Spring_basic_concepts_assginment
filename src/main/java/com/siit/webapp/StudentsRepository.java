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
        sc.useDelimiter(" , ");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            result=sc.next();
            System.out.print(result);  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner
        return result;
    }
}







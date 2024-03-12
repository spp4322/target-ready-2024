package com.targetindia.assignments.Day2.Assignment2.Programs;

import com.targetindia.assignments.Day2.Assignment2.Models.Person;
import com.targetindia.assignments.Day2.Assignment2.Models.Staff;
import com.targetindia.assignments.Day2.Assignment2.Models.Student;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] people = {
                new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
                new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0),
                new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0),
                new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
                new Student("Kiran", "Vasco, Goa", "ReactJS", 2017, 12500.0)
        };

        for(var p : people) {
            System.out.printf(p.toString());
            System.out.println();
        }
    }
}

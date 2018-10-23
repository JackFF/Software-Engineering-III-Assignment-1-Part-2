/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebind.se3assignment1b;

import com.codebind.se3assignment1.*;
import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 *
 * @author Jack
 */
public class main {
    
    public static void main(String[] args) {
        
        ArrayList<Course> listOfCourses = new ArrayList<>();
        Course CSIT = new Course("CS&IT", new LocalDate(2018, 9, 10), new LocalDate(2019, 6, 16));
        Course ME = new Course("Mechanical Engineering", new LocalDate(2018, 9, 10), new LocalDate(2019, 6, 16));
        Course EE = new Course("Electrical Enginnering", new LocalDate(2018, 9, 10), new LocalDate(2019, 6, 16));
        listOfCourses.add(CSIT);
        listOfCourses.add(ME);
        listOfCourses.add(EE);
        
        Modules programming = new Modules("Programming", "CT117");
        Modules fundamentals = new Modules("Fundamentals", "CT118");
        Modules electricals = new Modules("Electricals", "CT119");
        Modules materials = new Modules("Materials", "CT120");
        Modules professionalSkills = new Modules("Professional Skills", "CT121");
        Modules computerSystems = new Modules("Computer Systems", "CT122");
        
        CSIT.addModulesToCourse(programming);
        CSIT.addModulesToCourse(electricals);
        CSIT.addModulesToCourse(professionalSkills);
        CSIT.addModulesToCourse(computerSystems);
        ME.addModulesToCourse(fundamentals);
        ME.addModulesToCourse(materials);
        ME.addModulesToCourse(professionalSkills);
        EE.addModulesToCourse(programming);
        EE.addModulesToCourse(electricals);
        EE.addModulesToCourse(professionalSkills);
        
        ArrayList<Student> listOfStudents = new ArrayList<>();
        Student jackFoley = new Student("Jack", "Foley", "21", new LocalDate(1997, 4, 23), "15478258", CSIT);
        Student bobHanamen = new Student("Bob", "Hanamen", "18", new LocalDate(1999, 3, 27), "18123456", ME);
        Student francisJoley = new Student("Francis", "Joley", "56", new LocalDate(1962, 9, 7), "78654321", ME);
        Student jamesMoley = new Student("James", "Moley", "20", new LocalDate(1998, 8, 30), "17789456", EE);
        listOfStudents.add(jackFoley);
        listOfStudents.add(bobHanamen);
        listOfStudents.add(francisJoley);
        listOfStudents.add(jamesMoley);
        
        System.out.print(listOfCourses);
        System.out.print(listOfStudents);
    }
}

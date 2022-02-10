	package com.Spring_Jdbc1;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	DbOperations dao = context.getBean("dao", DbOperations.class);
    	
//        System.out.println("Number of students registered : " + dao.getCountOfStudents());
    	
    	
    	
    	
    	Scanner scan = new Scanner(System.in);
//    	
    	System.out.println("Enter id");
//    	
    	int id = scan.nextInt();
//    	
    	Student theStudent = dao.getStudentDetails(id);
//    	
    	System.out.println(theStudent);
    	
    	
    	
    	
    	
    	
//    	System.out.println("All Students registered with us : ");
//    	
//    	List<Student> allStudents = dao.getAllStudents();
//    	
//    	allStudents.forEach(System.out::println);
    	
    	
//    	scan.nextLine();
//    	
//    	String name = scan.nextLine();
//    	
//    	System.out.println("Location : " + dao.getStudentLocation(id, name));
    }
}

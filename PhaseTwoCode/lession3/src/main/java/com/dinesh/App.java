package com.dinesh;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//        Get the SessionFactory
    	SessionFactory factory = new Configuration()
    								.configure("hibernate.cfg.xml")
    								.addAnnotatedClass(Product.class)
    								.buildSessionFactory();
    	
//    	Get the Session
    	Session theSession = factory.getCurrentSession();
    	System.out.println("Enter a productId, productPrice and productName :");
    	Scanner scan = new Scanner(System.in);
    	int productId = scan.nextInt();
    	int productPrice = scan.nextInt();
    	scan.nextLine();
    	String productName = scan.nextLine();
    	
    	try {
//    		Add a new learner
    		Product theLearner = new Product(productId,productName,productPrice);
    		
//    		Start the transaction
    		theSession.beginTransaction();
    		
//    		Save the learner
    		theSession.save(theLearner);
    		
//    		Commit the transaction
    		theSession.getTransaction().commit();
    		
    		
    		
    	}finally {
    		factory.close();
    	}
    }
}

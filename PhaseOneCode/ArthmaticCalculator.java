package Rest5Code;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ArthmaticCalculator {
	public static void main(String[] args) {
		double Result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the two numbers");
		int num1=sc.nextInt();
		int num2= sc.nextInt();

		ArthmaticCalculator arthmaticCalculator = new ArthmaticCalculator();
		arthmaticCalculator.add(num1, num2);
		ArthmaticCalculator arthmaticCalculator2 = new ArthmaticCalculator();
		arthmaticCalculator2.sub(num1, num2);
		ArthmaticCalculator arthmaticCalculator3 = new ArthmaticCalculator();
		arthmaticCalculator3.mult(num1, num2);
		ArthmaticCalculator arthmaticCalculator4 = new ArthmaticCalculator();
		arthmaticCalculator4.Div(num1, num2);

	}
	final void add(int a,int b) {
		double Result = a + b;
		System.out.println("The Addition is :"+Result);
	}
	final void sub(int a,int b) {
		double Result = a - b;
		System.out.println("The Substraction is :"+Result);
	}
	final void mult(int a,int b) {
		double Result = a * b;
		System.out.println("The Multiplecation is :"+Result);
	}
	final void Div(int a,int b) {
		try {
		double Result = a / b;
		System.out.println("The Division is :"+Result);
		}
		catch(ArithmeticException ae) {
			System.out.println("Please donot press 0 for division");
			
		}
	}
}

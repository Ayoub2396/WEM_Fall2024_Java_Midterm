package mathproblems;

import java.util.InputMismatchException;

public class Pattern {
	/* Write a program in Java to demonstrate the use of multiple catch blocks for the following math problem
             As a user I am trying to divide a number with another number
             */

	public static void devide(int a,int b){
		try {


			double result;
			result =(double) a / b;
			System.out.println(result);
		}catch (ArithmeticException arithmeticException){
			System.out.println("the number b can not be 0");
		}

	}
	public static void main(String[] args) {
		devide(7,0);

	}
}

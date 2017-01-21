package game;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double fNum , sNum  ;
		System.out.println("Welcome to My Calculator , I give you addition of number");
		System.out.println("Please enter first number :");
		fNum = s.nextDouble() ;
		System.out.println("Please enter Second number :");
		sNum = s.nextDouble() ;
		s.close();
		System.out.println(" Addition is : "+ (fNum + sNum));
	}

}

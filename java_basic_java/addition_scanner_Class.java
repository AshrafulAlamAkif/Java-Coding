package java_basic_java;

import java.util.Scanner;

public class addition_scanner_Class {

	public static void main(String[] args) {
		// TODO The Scanner class provides the methods that allows us to read the user input.
		
		
		Scanner addscanner = new Scanner(System.in);

		System.out.println("Enter 1st number: ");
		int num1 = addscanner.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int num2 = addscanner.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum is : "+sum);
	}

}

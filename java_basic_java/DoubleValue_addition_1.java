package java_basic_java;

import java.util.Scanner;

public class DoubleValue_addition_1 {

	public static void main(String[] args) {
		
		/*
		Scanner add = new Scanner(System.in);
		
		System.out.println("Enter the fast double number: ");
		double num1 = add.nextDouble();
		
		System.out.println("Enter the second double number: ");
		double num2 = add.nextDouble();
		
		double sum = num1 + num2;
		
		System.out.printf("Double type Result is: %.3f%n", sum);
		System.out.printf("Double type Result is: %.3f%n", (num1 + num2));
		System.out.println("Double type Result is: "+String.format("%.3f%n",sum));
		add.close();
		*/
		
		

		int num1;
        double num2;
        double sum;
        num1 = 2;
        num2 = 3.325;
        sum = num1+num2;
        System.out.println("sum is :"+ sum);
        System.out.println("sum is : "+String.format("%.3f%n",sum));

		
		
		/*
		double num;
		double num2; 
		double sum;
		
		Scanner add = new Scanner(System.in);
		
		System.out.println("1st double num : ");
		num = add.nextDouble();
		
		System.out.println("2nd double num : ");
		num2 = add.nextDouble();
		
		sum = num + num2;
		add.close();
		System.out.println("Double type result is : "+ (num+num2));
		System.out.println("Double type result is : "+sum);
		
		// Display the result with a maximum of 3 decimal places
		System.out.printf("Double type result is: %.3f%n",sum);
		System.out.println("Double type result is: "+String.format("%.3f%n",sum));
		*/
		
		/*
		double num1,num2,sum;
		Scanner add = new Scanner(System.in);
		
		System.out.println("Enter the fast double number: ");
		num1 = add.nextDouble();
		System.out.println("Enter the second double number: ");
		num2 = add.nextDouble();
		
		sum = num1 + num2;
		System.out.println("Double type Result is: "+String.format("%.3f", sum));
		System.out.println("Double type Result is: "+String.format("%.3f%n",sum));
		
		// Or used printf
		System.out.printf("Double type Result is: %.3f%n",sum);
		System.out.printf("Double type Result is: %.3f",sum);
		add.close();
		*/

	}

}

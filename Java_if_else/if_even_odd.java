package Java_if_else;

import java.util.Scanner;

public class if_even_odd {

	public static void main(String[] args) {
		// TODO even odd check and number taking user
		
		Scanner evenOdd = new Scanner(System.in); //creating object
		
		System.out.println("Enter 1st number : ");
		int number1 = evenOdd.nextInt(); //value read and put number variable
		
		System.out.println("Enter 2nd number : ");
		int number2 = evenOdd.nextInt();
		
		int sum = number1 + number2;
		System.out.println("Total is : "+sum);
		
		if(sum%2 == 0) {
			System.out.println("total number is Even");
		}
		else {
			System.out.println("total number is Odd");
		}
		

	}

}

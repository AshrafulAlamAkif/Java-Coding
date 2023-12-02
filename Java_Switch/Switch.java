package Java_Switch;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Instead of writing many if..else statements, you can use the switch statement.
		//TODO The default keyword specifies some code to run if there is no case match:
		
		Scanner day = new Scanner(System.in);
		System.out.print("Enter day number: ");
		int dayNum = day.nextInt();
		
		
		switch (dayNum) {
		case 1:
			System.out.println("Saturday");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("Monday");
			break;
		case 4:
			System.out.println("Tuesday");
			break;
		case 5:
			System.err.println("Wednesday");
			break;
		case 6:
			System.err.println("Thursday");
			break;
		default:
			System.err.println("Friday");
		}
		day.close();
	}

}

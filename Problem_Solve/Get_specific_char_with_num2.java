package Problem_Solve;

import java.util.Scanner;

public class Get_specific_char_with_num2 {

	public static void main(String[] args) {

		/*TODO user can enter any character, 
		 * and the program will count how many times that character 
		 * appears in the sentence.
		 */
		
		// Create a Scanner object named user
		Scanner user = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Please Enter any sentence: ");
		String userName = user.nextLine();
		
		System.out.println("Now Enter your alphabet: ");
		char userChar = user.nextLine().charAt(0);// Get the first character of the input
		
		// Close the Scanner to release resources
		user.close();
		
		int i;
		int count = 0;
		
		for(i = 0; i<userName.length(); i++) {
			if(userName.charAt(i) == userChar) {
				count++;
			}
		}
		System.out.println("Your sentence is: "+userName);
		System.out.println("The '"+userChar+"' Character has come "+count+ " times");
	}
}

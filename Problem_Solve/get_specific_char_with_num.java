package Problem_Solve;

import java.util.Scanner;

public class get_specific_char_with_num {

	public static void main(String[] args) {
		// TODO “How many times does the character ‘a’ appear in the input sentence?”
		
        // Create a Scanner object named user
		Scanner user = new Scanner(System.in);
		
        // Prompt the user for input
		System.out.println("Enter entence: ");
		String userName = user.nextLine(); //When you use nextLine() in Java, it reads an entire line of input from the user, including spaces.
		
		// Close the Scanner to release resources
		user.close();
		
		int input;
		int count = 0;
		
		for(input = 0; input<userName.length(); input++) {
			if(userName.charAt(input)== 'a') {
				count++;
			}
		}
		
		System.out.println("The sentence is:"+userName);
		System.out.println("The 'a' Character has come "+count+ " times");
		
	}
}
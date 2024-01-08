package Loop;

public class WhileLoop_if$Break {

	public static void main(String[] args) {

		// Initialize a variable i with a value of 1
		int i = 1;
		// Start a while loop that continues as long as i is less than or equal to 5
		while(i <= 5) {
			// Check if i is equal to 3
			if(i == 3) {
				// If i is 3, print a message and exit the loop using break
				System.out.println("Desire/Find the Number is: "+i);
				//i++;
				break;
			}
			// Increment i to move to the next number
			i++;
			
		}
	}

}

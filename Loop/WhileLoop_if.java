package Loop;

public class WhileLoop_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize variable i with a value of 0
		int i = 0;
		//Start a while loop that Continues as long as i is less than 10
		while(i < 10) {
			//Check if i is equal to 5
			if(i == 5) {
				// If i is 5, increment i and skip the rest of the loop using continue
				System.out.println("The Secret Number is : "+i);
				i++;
				continue;
			}
			// Print the value of i
			System.out.println("the value of "+i);
			// Increment i to move to the next number
			i++;
			
		}
	}

}

package Loop;

public class ForLoop_if$Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Loop from 1 to 9
		for(int i = 1; i<=9; i++) {
			// Check if i is equal to 3
			if(i ==3) {
				// If i is 3, print a message and increment i, then continue to the next iteration
				System.out.println("Desire Number: "+i);
				i++;
				continue;
			}
			// If i is not 3, print a different message
			System.out.println("Common Number: "+i);
		}

	}

}

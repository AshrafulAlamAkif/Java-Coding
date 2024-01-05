package Loop;

public class ForLoop_if$break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i<5; i++) {
			if(i==3) {
				System.out.println("The finding number is : "+i);
				break;
			}
			System.out.println("Number: "+i);
		}
	}

}

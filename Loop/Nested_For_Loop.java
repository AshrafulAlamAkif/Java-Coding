package Loop;

public class Nested_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Outer loop
		for(int i = 0; i <=2; i++) {
			System.out.println("Outer Result: "+i);
			
			//Inner loop
			for(int j = 0; j<=3; j++) {
				System.out.println("Inner Result is: "+j);
			}
		}

	}

}

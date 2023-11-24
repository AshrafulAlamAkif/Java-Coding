package Type_Custing;

public class int_to_double {

	public static void main(String[] args) {
		//Widening Casting
//Widening casting is done automatically when passing a smaller size type to a larger size type:
		
		int myInt = 5;
		double myDouble = myInt;
		
		System.out.println("Integer value is :"+myInt);
		//n for line break/new line
		System.out.println("Integer value is :"+String.format("%.3f%n",myDouble));
		System.out.println("Integer to Double :"+String.format("%.2f",myDouble));
		
	}

}

package Swap;

public class swapUsingTempVariable {

	public static void main(String[] args) {
		// TODO Using a temporary variable
		
		int m = 20;
		int n = 10;
		
		System.out.println("Before Swap m is : "+m);
		System.out.println("Before Swap n is : "+n);
		
		// Using a temporary variable
		int temp = m;
		m = n;
		n = temp;
		
		System.out.println("After Swap m is : "+m);
		System.out.println("After Swap n is : "+n);
		
	}

}

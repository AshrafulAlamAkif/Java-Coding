package Swap;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 20;
		int n = 10;
		
		System.out.println("Before Swap m is : "+m);
		System.out.println("Before Swap m is : "+n);
		
		m = m + n; // m is 30
		n = m - n; // n is 30-10 = 20
		m = m - n; // m is 30-20 = 10
		
		System.out.println("After Swap m is : "+m);
		System.out.println("After Swap n is : "+n);
		
	}

}

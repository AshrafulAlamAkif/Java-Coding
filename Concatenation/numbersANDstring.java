package Concatenation;

public class numbersANDstring {

	public static void main(String[] args) {
		// TODO Java uses the + operator for both addition and concatenation.
		//TODO Numbers are added. Strings are concatenated.
		
		int x = 10;
		int y = 5;
		int z = x+y;
		System.out.println("sum is : "+z); //an integer/number
		
		
		String x1 = "10";
		String y1 = "5";
		String z1 = x1+y1;
		System.out.println("as a String : "+ x1+y1); // a String
		System.out.println("as a String : "+ z1);
		
		String xx = "10";
		int yy = 6;
		String zz= xx+yy;
		System.out.println("as a String : "+ zz);
		
		// Convert the string to an integer and add it to yy1
		String xx1 = "10";
		int yy1 = 5;
		int zz1= Integer.parseInt(xx1)+yy1; 
		System.out.println("as a int : "+ zz1);
		
		
		
		int xx2 = 10;
        int yy2 = 5;

        // Convert the result to a string
        String zz2 = String.valueOf(xx2 + yy2);
        //or
        //String zz2 = "" + (xx2 + yy2);

        System.out.println("as a String : " + zz2);
		
		
	}

}

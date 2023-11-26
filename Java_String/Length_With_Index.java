package Java_String;

public class Length_With_Index {

	public static void main(java.lang.String[] args) {
		
		String text = "My name is Akif";
		
		System.out.println("text length is : "+text.length());
		
		String desiar_text = "Akif";
		System.out.println("Selected text length is : "+desiar_text.length());
		//or
		int selecTextLength = desiar_text.length();
		System.out.println("selected text length : "+selecTextLength);
		
						//find length with index number
		// Get the substring "ABCDEFGH" (index 10 to 15, exclusive)
		String text_index = text.substring(11, 15);
		System.out.println("the text is : "+text_index);
		System.out.println("the text length : "+text_index.length());
		
		//or
		
		int fastindex = 11;
		int endindex = 15;
		String subStringIS = text.substring(fastindex, endindex);
		System.out.println("SEARCHING TEXT IS : "+subStringIS);
		System.out.println("SEARCHING TEXT IS : "+subStringIS.length());
		
		   
        
	}

}

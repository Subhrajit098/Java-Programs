package Practice;

public class SwapString {

	public static void main(String[] args) {

		String s = "Welcome To My World ";
		
		// Split the string into words
		String[] sp=s.split(" ");
		
		sp[0] ="welcome";
		sp[1] ="To";
		sp[2] ="My";
		sp[3] ="World";
		
		System.out.println(sp[1]+" "+sp[2]+" "+sp[3]+" "+sp[0]);
		
	}

}

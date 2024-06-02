package Practice;

public class ReversePractice {

	public static void main(String[] args) {

		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(rev.equals(s)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}

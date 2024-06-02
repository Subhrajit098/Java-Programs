package Practice;

public class PalinDrome {

	public static void main(String[] args) {

		String s="Hello";
		String st=s.toLowerCase();
		StringBuilder sb=new StringBuilder(st);
		String str=sb.reverse().toString();
		
		if(st.equals(str)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}

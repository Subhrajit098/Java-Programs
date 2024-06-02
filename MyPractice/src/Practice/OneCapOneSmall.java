package Practice;

public class OneCapOneSmall {

	public static void main(String[] args) {

		String s="65@##@Subhrajit37#$%#";
		String s1=s.replaceAll("[^a-zA-Z]", "");
		String sb=s1.toLowerCase();
		
		String result;
		for(int i=0;i<s1.length();i++) {
			String sr="";
			char ch;
			if(i%2 == 0) {
				ch=sb.charAt(i);
				sr+=ch;
				result=sr.toUpperCase();
			
				
			}
			else {
				ch=sb.charAt(i);
				sr+=ch;
				result=sr.toLowerCase();
			}
			System.out.print(result);
		}
		
	}

}

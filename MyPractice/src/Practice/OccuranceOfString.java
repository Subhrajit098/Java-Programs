package Practice;

public class OccuranceOfString {

	public static void main(String[] args) {

		String s="Malayalam";
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			char ch1=s.charAt(i);
			for(int j=i; j<s.length();j++) {
				char ch=s.charAt(j);
				if(ch==ch1) {
					count++;
				}
				
			}
			System.out.println("Occurance of string is == "+ch1+ " ==> "+count);
			
		}
		
	}

}

package Practice;

public class EverySecondCharRev {

	public static void main(String[] args) {

		String s="myjava";
		
		char temp;
		for(int i=0;i<s.length();i+=2) {
			char first=s.charAt(i);
			char second=s.charAt(i+1);
			
			temp=first;
			first=second;
			second=temp;
			System.out.print(first+""+second);
			
		}				
		
	}

}

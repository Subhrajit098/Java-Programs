package Practice;

public class FindNum {

	public static void main(String[] args) {

		String s="Subhrajit12#3456$5436%%4333";
		
		String num="";
		int count=0;
		
		String chr="";
		int chrcount=0;
		
		String sc="";
		int sccount=0;
		
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch >='0' && ch <= '9'){
				num=num+s.charAt(i);
				count++;
			}
			else if(ch >='A' && ch <='Z' || ch >='a' && ch <='z') {
				chr=chr+s.charAt(i);
				chrcount ++;
			}
			else {
				sc=sc+s.charAt(i);
				sccount++;
			}
			
			
			 
		}
		System.out.println(" Total Number count is "+ count + " Total character is "+chrcount + " Total special character is "+sccount+ " "+sc);
	}

}

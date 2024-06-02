package Practice;

public class SumOfIntegerInString {

	public static void main(String[] args) {
        
		String s="Abc2ER1*%$#3d";
		int sum=0;
		String num="";
		int count=0;
		String Cap="";
		int capcount=0;
		String small="";
		int smallcount=0;
		String spcl="";
		int spclcount=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>='0' && ch<='9') {
				int n=s.charAt(i)-48;
				sum=sum+n;
				num=num+s.charAt(i);
				count++;
			}
			else if(ch >='A' && ch <='Z')
			{
				Cap=Cap+s.charAt(i);
				capcount++;
			}
			else if(ch>='a' && ch<='z') {
				small=small+s.charAt(i);
				smallcount++;
				
			}
			else {
				spcl=spcl+s.charAt(i);
				spclcount++;
			}
		}
		
		System.out.println("Sum is = "+sum);
		System.out.println("Total num is = "+count+"--> "+num);
		System.out.println("Total capital letter is = "+capcount+" --> "+Cap);
		System.out.println("Total small letter is "+smallcount+" --> "+small);
		System.out.println("Total spcl character is = "+spclcount+" --> "+spcl);
		
		
	}

}

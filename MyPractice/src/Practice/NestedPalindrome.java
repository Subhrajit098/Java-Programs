package Practice;

public class NestedPalindrome {

	public static void main(String[] args) {
         
		String s="nitin";
		String rev="";
		String rev2="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev+=s.charAt(i);
		}
		System.out.println("palindrom1->"+rev);
		for(int j=s.length()-2;j>0;j--)
		{
			 rev2=rev+s.charAt(j);
			 
		}
		System.out.println("nestedpalindrom2->"+rev2);
		

		}
	}
		
	

	
	



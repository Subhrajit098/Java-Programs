package Practice;

public class RevWithoutRev {
	public static void main(String[] args) {
		String s="subhrajit";
		char[] ch=s.toCharArray();
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
	
	

}

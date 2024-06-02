package Practice;

public class UpperCaseLowerCase {
	public static void main(String[] args) {
//		String s="smruti";
//		String s1="sagar";
//		//output=tisagar
//		String str=s.substring(4, 6);
//		System.out.println(str+s1);
		
		String s="subhrajit";
		
		String up="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i%2==0) {
				up=up+Character.toUpperCase(ch);
			}
			else {
				up=up+Character.toLowerCase(ch);
			}
		}
		System.out.println(up);
		
		
		
		//---------------------------------------------------------------------------------------------------------------------------
		
		//StringBuilder result = new StringBuilder();

		//for (int i = 0; i < s.length(); i++) {
		 //   char c = s.charAt(i);
		 //   if (i % 2 == 0) {
		  //      result.append(Character.toUpperCase(c));
		 //   } else {
		   //     result.append(Character.toLowerCase(c));
		  //  }
		//}

	//	String output = result.toString();
		//System.out.println(output);
		
		
		
		
		
	}

}

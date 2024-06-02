package Practice;

public class reverse {

	public static void main(String[] args) {
		String str = "My name is subhrajit";
		String[] s = str.split(" ");
		/*
		 * StringBuilder sb=new StringBuilder(str); sb.reverse();
		 * System.out.println(sb);
		 */
//*--------------------------------------------------------------------------------------------------------------------------------------------------------		

//	String rev="";
		for (int i = 0; i < s.length; i++) {
			String ch=s[i];
			for (int j=ch.length()-1;j>=0;j--) {
				System.out.print(ch.charAt(j));
				

			}
			System.out.print(" ");
		}

	}
}

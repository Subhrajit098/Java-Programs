package Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class vowel {

	public static void main(String[] args) {

		/*
		 * String s = "testyantra"; LinkedHashSet<Character> set = new
		 * LinkedHashSet<Character>(); for (int i = 0; i < s.length(); i++) {
		 * set.add(s.charAt(i)); }
		 * 
		 * System.out.println("After removal of duplicate character we get " + set);
		 * 
		 * ArrayList<Character> list = new ArrayList<>(set);
		 * System.out.println("The size of actual string is " + s.length());
		 * System.out.println("The size of string after duplicate removal " +
		 * list.size()); for (int i = list.size() - 1; i >= 0; i--) { char ch =
		 * list.get(i); System.out.println(ch+" charater present in "+i);
		 * 
		 * }
		 */

		// ************************************************************************************************************************************

		/*String[] s = { "chinmaya", "Dalwin", "Tulu" };

		for (int i = 0; i < s.length; i++) {
			int count = 0;
			String s1 = s[i].toLowerCase();

			for (int j = 0; j < s1.length(); j++) {

				char ch = s1.charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}

			}
			System.out.println(s1 + "-----> " +count);

		}*/
		
		/*String s="subhrajit";
		String vowel="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowel=vowel+s.charAt(i);
				count++;
			}
		}
		System.out.println("Total vowel is = "+count+"---> "+vowel);
	}*/
		String s="India";
		int vowel=0;
		String s1="";
		String sx=s.toLowerCase();
		char[] chr=sx.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<chr.length;i++) {
			set.add(chr[i]);
		}
		for(char cx:set) {
			s1=s1+cx;
			if(cx=='a' || cx=='e' || cx=='i' || cx=='o' || cx=='u') {
				vowel++;
				
			}
		}
		System.out.println(s1+" "+vowel);
	}
}
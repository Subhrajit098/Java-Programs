package Practice;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class OccuranceOfEachCharOfString {

	public static void main(String[] args) {

		String s="Malayalam";
		for(int i=0;i<s.length();i++) {
			int count=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++) {
				char ch1=s.charAt(j);
				if(ch==ch1 && i>j) {
					break;
				}
				if(ch==ch1) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch+" : is repeating = "+count+" times");
			}
		}
		
		
		//*********************************************************************************************************************************************
		
		/*for(int i=0;i<s.length();i++) {
			int count=1;
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(j)==ch && i>j) {
					break;
				}
				if(s.charAt(j)==ch) {
					count++;
				}
			}
			System.out.println(ch+" : is repeating : "+count+" times");
		}
		//***********************************************************************************************************************
		
		//Occurance of character using map
		/*String s="aabbccecdd";
		HashMap<Character,Integer> map=new HashMap<> ();
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))!=null) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			
			else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);*/
		
//-----------------------------------------------------------------------------------------------------------------------------------------		
		
	/*	String s="subhrajitbarik";
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		
		for(Character sx:set) {
			int count=0;
			for(int j=0;j<s.length();j++) {
			   if(sx.equals(s.charAt(j))) {
				   count++;
			   }
			}
			System.out.println("Total character "+sx+" repeating "+count);
		}
		*/
	}

}

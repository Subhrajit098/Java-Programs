package Practice;

public class RemoveUnwantedFromString {

	public static void main(String[] args) {
		String s="Subhrajit@%%#%$568564BA#@$RIK";
		String st=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After Removing Unwanted Remaining Part Is "+st);
		
		
		String cap="";
		int count=0;
		String small="";
		int countsm=0;
		int sum=0;
		
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				cap=cap+ch;
				count++;
			}
			else if(ch>='0'&&ch<='9') {
				int n=ch-48;
				sum+=n;
				
			}
			else {
				small=small+ch;
				countsm++;
			}
		}
		System.out.println("Capital Alphabet is "+cap+" Count is "+count);
		System.out.println("Small Alphabet is "+small+" Count is "+countsm);
		System.out.println("Total sum of integer is "+sum);

	}

}

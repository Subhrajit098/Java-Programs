package Practice;

public class NameInShortForm {

	public static void main(String[] args) {

		String s="Subhra Jit Barik";
		String name="";
		String []sb=s.split(" ");
		for(int i=0;i<sb.length-1;i++) {
			
			if(sb[i].length()>0) {
				name+=sb[i].charAt(0)+".";
			}
		}
		name+=" "+sb[sb.length-1];
		System.out.println("Mr."+name);
	}

}

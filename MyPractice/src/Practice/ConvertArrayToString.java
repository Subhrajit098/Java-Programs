package Practice;

public class ConvertArrayToString {

	public static void main(String[] args) {

		char []x= {'a','b','c'};
		//String str=String.valueOf(x);
		//System.out.println("Array value converted into String "+str);
		//--------------------Another Way----------------------
		String str=new String(x);
		System.out.println("Array value is converted into String is "+str);
	}

}

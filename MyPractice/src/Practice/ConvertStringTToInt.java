package Practice;

public class ConvertStringTToInt {

	public static void main(String[] args) {

		String str="543545";
		//int i=Integer.parseInt(str);
		//System.out.println("String is converted to Integer "+i);
		//-------------------Another Way--------------------------
		int i=Integer.valueOf(str);
		System.out.println("Integer Value is "+i);
		
		
	}

}

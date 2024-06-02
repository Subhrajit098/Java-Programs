package Exception;

public class Excptn {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		int z=0;
		
		try {
			z=x/y;
		}
		
		catch(ArithmeticException E)
		{
		System.out.println("Arithmatic exception is handled");	
		}

		System.out.println("Ans is zero "  + z );
		
	}

}

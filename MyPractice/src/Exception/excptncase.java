package Exception;

public class excptncase {
// xception handled with multiple catch block
	public static void main(String[] args) {
		int []x=new int[2];
		try
		{
			int z=x[0]/x[2];
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is Handled");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("A I O B E is handled");
		}
        
	}

}

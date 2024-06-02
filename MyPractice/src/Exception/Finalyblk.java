package Exception;

public class Finalyblk {
//finally block executed at any cost
	public static void main(String[] args) {
		try {
			int x=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("Any how executed");
		}

	}

}

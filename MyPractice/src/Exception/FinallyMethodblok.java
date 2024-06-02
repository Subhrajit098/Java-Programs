package Exception;

public class FinallyMethodblok {

	public static void main(String[] args) {

		System.out.println(m1());
	}
	public static int m1() {
		try {
			return 123;
		}
		
		catch(ArithmeticException e){
			return 456;
		}
		finally {
			return 789;
		}
	}

}

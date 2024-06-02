package programs;

public class cube {

	public static void main(String[] args) {
		
		int base = 2;
		int pow = 3;
		int prod = 1;
		for(int i=1; i<=pow; i++) {
			prod = prod*base;
		}
		System.out.println(prod);

	}

}

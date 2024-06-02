package programs;

public class Strongnumber {

	static int factorial(int dig) {
		int fact=1;
		for(int i=dig; i>=1; i--) {
			fact=fact*1;
		}
		return fact;
	}
	public static void main(String[] args) {
		int n=2;
		int copy=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+factorial(rem);
			n=n/10;
			
		}

	if(copy==sum) {
		System.out.println("It is a Strong number");
	}
	else
	{
		System.out.println("Not a strong number");
	}
		
		
	}

}

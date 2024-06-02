package programs;

public class ArmStrongNumber {

	static int power(int d,int p) {
		int prod=1;
		for(int i=1; i<=p; i++) {
			prod=prod*d;
			
		}
		return prod;
	}
	public static void main(String[] args) {

		int n=5;
		int copy=n;
		int p=0;
		while(n>0) {
			p++;
			n=n/10;
		}
		int sum=0;
		for(int i=copy; i>0; i=i/10) {
			
			sum=sum+power(i%10,p);
			if(copy==sum) {
				System.out.println("Armstrong Number");
			}
			else {
				System.out.println("not a Armstrong");
			}
		}

	}

}

package Practice;

public class AdditionOfTwoArray {

	public static void main(String[] args) {

		int []x= {1,2,3,4,5};
		int []y= {6,7,8,9,10,88};
		
		int []z=new int [y.length];
		
		for(int i=0;i<x.length;i++) {
			z[i]=x[i]+y[i];
		}
		
		int total=0;
		for(int i=0;i<z.length;i++) {
			total=total+z[i];
			
		}
		System.out.println(total);
	}

}

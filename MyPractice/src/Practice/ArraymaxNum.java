 package Practice;

public class ArraymaxNum {

	public static void main(String[] args) {
    
		int x[]={22,55,34,55,22,878,78};
		int max=x[0];
		for(int i=0; i<x.length; i++) {
			if(x[i]>max) {
				max=x[i];
			}
		}
		System.out.println(max);
	}

}

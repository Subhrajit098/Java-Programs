package Practice;

public class MethodOverloading {

	
	 public void m1(int a) {
      System.out.println(" m1 a printed");
	}
	
	public void m1(double j) {
	System.out.println("m1 not st is print");
	}
	public static double m1(double d,double e) {
		return d+e;
	}
	
	public static void main(String[] args) {
		MethodOverloading mv=new MethodOverloading();
		mv.m1(10);
		System.out.println(MethodOverloading.m1(15.3,25.4));
	}
}

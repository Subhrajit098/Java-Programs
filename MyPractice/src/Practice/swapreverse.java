package Practice;

public class swapreverse {

	public static void main(String[] args) {
	
		String str="My name is subhrajit barik";
		String x[]=str.split("");
		       x[0]="My";
		       x[1]="name";
		       x[2]="is";
		       x[3]="subhrajit";
		       x[4]="barik";
		StringBuilder sb=new StringBuilder(x[3]);
		sb.reverse();
		       System.out.println(x[4]+" "+sb+" "+x[2]+" "+x[1]+" "+x[0]);
		

	}

}

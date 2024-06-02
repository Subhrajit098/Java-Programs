package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
	int rollno;
	int age;
	String name;
	public ArraylistDemo(int rollno, int age, String name) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		ArraylistDemo al=new ArraylistDemo(101, 18, "Sileza");
		ArraylistDemo a2=new ArraylistDemo(402, 32, "Subhrat");
		ArraylistDemo a3=new ArraylistDemo(203, 22, "Perry");
		ArrayList a1=new ArrayList<>();
		a1.add(al);
		a1.add(a2);
		a1.add(a3);
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			ArraylistDemo m1=(ArraylistDemo)itr.next();
			System.out.println(m1.rollno);
			System.out.println(m1.age);
			System.out.println(m1.name);
		}
		
		
		
		
		
		/*ArrayList<String>demo=new ArrayList<String>();
		demo.add("Apple");
		demo.add("Samsung");
		demo.add("MI");
		demo.add("Oneplus");
		demo.add("Realme");
		demo.add("redmi");
		System.out.println(demo);
		demo.remove(2);
		demo.remove("redmi");
		System.out.println("after="+demo);
		Collections.sort(demo);
		for(String x:demo)
		{
			System.out.println(x);
			
		}*/

	}

	private static void ArraylistDemo() {
		// TODO Auto-generated method stub
		
	}

}

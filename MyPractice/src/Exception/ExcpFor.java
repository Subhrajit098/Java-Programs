package Exception;

public class ExcpFor {

	public static void main(String[] args) {

		System.out.println("main starts");
		for(int i=1; i<=5; i++)
		{
			try
			{
				break;
			}
			
			finally {
				System.out.println("Finally is running");
			}
		}
		System.out.println("main end");
	}

}

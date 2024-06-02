package Practice;

public class CallThePrpty extends SameNameInDiff {

	
/*	public void printprpty() {
		System.out.println(s);
	}
		
	public static void main(String[] args) {

		CallThePrpty ct=new CallThePrpty();
		ct.printprpty();

		
	}*/
	
	public void pintPrpty(SameNameInDiff sni) {
		System.out.println(sni.s);
	}
	public static void main(String[] args) {
		CallThePrpty ctp=new CallThePrpty();
		SameNameInDiff Snm=new SameNameInDiff();
		ctp.pintPrpty(Snm);
		
	}

}

package Practice;

import java.util.Arrays;

/**merge of two array
 *
 */
public class MergeOfTwoArray {

	public static void main(String[] args) {
		
		int[] x= {13,8,18,5,25};
		int[] y= {30,28,15,35,50};
		int[] z=new int[x.length+y.length];
		int zi=0;
		for(int i=0;i<x.length; i++)
		{
			z[zi]=x[i];
			zi++;
		}
		
		for(int i=0; i<y.length;i++)
		{
			z[zi]=y[i];
			zi++;
		}
		System.out.println(Arrays.toString(z));

	}

}


//copying an array
import java.lang.String;
import java.lang.System;
public class Arraypractice
{
	public static void main(String[] arg)
	{
		int A[]={8,6,10,9,2,15,7,13,14,11};
		int B[]=new int[10];
		System.out.println("Array A:");
		for(int x:A)
			System.out.print(x +" ");
		System.out.println("");
	for(int i=0;i<A.length;i++)
		B[i]=A[i];
	System.out.println("");
	System.out.println("Array A copied to Array B:");
	for(int i=0;i<B.length;i++)
		System.out.print(B[i] +" ");
	System.out.println("");
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int xor=0;
		for(int i=0;i<n;i++){
		    String s=sc.next();
		    int k=Integer.parseInt(s,2);
		    xor=xor^k;
		}
		System.out.println(xor);

	}
}

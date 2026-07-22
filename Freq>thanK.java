import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		// your code goes here
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
int hash[]=new int[256];
for(int i=0;i<s.length();i++){
      hash[s.charAt(i)]++;
}
for(int i=0;i<256;i++){
    if(hash[i]>=k)
    System.out.print((char)i);
}
	}
}

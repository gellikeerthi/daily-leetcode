// ip:
// 5 10
// 1 5 9 12 14
// op:
// 9
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
int k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int j=0,c=0;
int max=Integer.MAX_VALUE;
for(int i=0;i<n;i++){
    j=Math.abs(k-a[i]);
if(j<max||(j==max&&a[i]<c)){
    max=j;
    c=a[i];
}
}
System.out.println(c);

	}
}

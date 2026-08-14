// ip:
// 10
// 4 3 53 13 2 44 55 35 56 34
// op:
// 2 56
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
Arrays.sort(a);

  System.out.print(a[0]+" "+a[n-1]);  





	}
}

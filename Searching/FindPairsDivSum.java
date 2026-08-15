ip:3 5
1 4
2 5
6 4
op:
(1, 4)
(6, 4)
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
int a[][]=new int[n][2];
for(int i=0;i<n;i++){
    a[i][0]=sc.nextInt();
    a[i][1]=sc.nextInt();
}
for(int i=0;i<n;i++){
int sum=a[i][0]+a[i][1];
if(sum%k==0){
    System.out.println("("+a[i][0]+", "+a[i][1]+")");
}

	}
	}
}


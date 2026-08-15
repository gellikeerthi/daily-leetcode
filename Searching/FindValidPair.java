// ip:3
// 1 2
// 2 3
// 4 5
// 3 15
// op:2 3
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
int a[][]=new int[n][2];
for(int i=0;i<n;i++){
    a[i][0]=sc.nextInt();
    a[i][1]=sc.nextInt();
}
int left=sc.nextInt();
int right=sc.nextInt();
for(int i=0;i<n;i++){
    int sum=a[i][0]+a[i][1];
    int product=a[i][0]*a[i][1];
    if(sum>=left&&sum<=right&&product>=left&&product<=right){
        System.out.println(a[i][0]+" "+a[i][1]);
    }
}
	}
}

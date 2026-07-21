// ip:
// 10 3
// 9 8 2 4 1 9 9 5 1 8
// op:
// 23
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
int l=0;
int r=k;
int m=n-k+1;
int sum=0,sum1=0;
while(l<m){
    sum1=0;
    for(int i=l;i<r;i++){
        sum1+=a[i];
    }
        if(sum1>sum){
            sum=sum1;        
        }
        l++;
        r++;
    }
    System.out.println(sum);
}
	}


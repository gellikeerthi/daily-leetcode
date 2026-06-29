//input:
1
7 2
2 4 8 1 2 1 8
//output:
12
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }int l=0;
		    int sum=0;
		    int r=k-1;
		    for(int i=0;i<k;i++){
		        sum+=a[i];
		    }
		    int max=sum;
		    for(int i=l;i<r;i++){
		   while(r<n-1){
		       sum=sum-a[l];
		       l++;
		       r++;
		       sum=sum+a[r];
		   
		   if(sum>max){
		       max=sum;
		   }
		   }
		    }
		   System.out.println(max);
		}

	}
}

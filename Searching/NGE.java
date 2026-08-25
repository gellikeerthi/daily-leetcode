// ip:
// 4
// 4 5 2 10
// op:
// 5 10 10 -1
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
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int nge[]=new int[n];
int max=Integer.MIN_VALUE;

for(int i=0;i<n;i++){
nge[i]=-1;
    for(int j=i+1;j<n;j++){
        if(a[j]>a[i]){
            nge[i]=a[j];
            break;
        }
    }
}
for(int i=0;i<n;i++){
    System.out.print(nge[i]+" ");
}


	}
}

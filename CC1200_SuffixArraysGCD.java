//Codechef 1200 SuffixArrayProblem
// ip:
// 4
// 4 3 2 6
// op:
// 2
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
   static int gcd(int a,int b){
        while(b!=0){
        int temp=a%b;
        a=b;
        b=temp;
        }
        return a;
   }
   
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int prefix[]=new int[n];
int suffix[]=new int[n];
prefix[0]=a[0];
for(int i=1;i<n;i++){
    prefix[i]=gcd(prefix[i-1],a[i]);
}
suffix[n-1]=a[n-1];
for(int i=n-2;i>=0;i--){
    suffix[i]=gcd(a[i],suffix[i+1]);
}
int maxgcd=0;
for(int i=0;i<n;i++){
    int currentgcd;
    if(i==0){
        currentgcd=suffix[1];
    }else if(i==n-1){
        currentgcd=prefix[n-2];
    }else{
        currentgcd=gcd(prefix[i-1],suffix[i+1]);
    }
    
    maxgcd=Math.max(maxgcd,currentgcd);
}

System.out.println(maxgcd);




	}
}

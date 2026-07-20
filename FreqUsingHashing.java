//Frequency of each element using hashing
//  input:
// 3
// 10
// 1 2 1 2 1 3 4 1 2 3
// 5 
// 1 1 1 1 1
// 5
// 1 2 1 2 1
//   output:
// 4 3 4 3 4 2 1 4 3 2
// 5 5 5 5 5
// 3 2 3 2 3
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
		    int hash[]=new int[100];
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        hash[a[i]]++;
		        }
		    for(int i=0;i<n;i++){
		        System.out.print(hash[a[i]]+" ");
		    }
		    System.out.println();
		}

	}
}

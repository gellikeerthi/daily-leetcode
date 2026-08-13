// input
// 2 3
// 2 3 4
// 4 5 6
// 1 7 4 
// 6 4 9
//   output
//   3 10 8
// 10 9 15
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
	int m=sc.nextInt();
	int a[][]=new int[n][m];
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
	    a[i][j]=sc.nextInt();
	}
	}
	int b[][]=new int[n][m];
		for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
	    b[i][j]=sc.nextInt();
	}
	}
	int c[][]=new int[n][m];
	int sum=0;
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
	        c[i][j]=a[i][j]+b[i][j];
	    }
	}
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
	System.out.print(c[i][j]+" ");
	    }
	    System.out.println();
	}
	
}
}

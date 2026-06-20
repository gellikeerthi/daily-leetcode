input:
  1 2 3
  4 5 6
  7 8 9
output:
1 2 3 6 5 4 7 8 9
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
		for(int i=0;i<n;i++){
		    if(i%2==0){
		    for(int j=0;j<m;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    }
		    else{
		        for(int j=m-1;j>=0;j--){
		            System.out.print(a[i][j]+" ");
		        }
		    }
		    
		}

	}
}

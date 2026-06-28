//Equal Rows and Columns count
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		int count=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        boolean same=true;
		        for(int k=0;k<n;k++){
		        if(a[i][k]!=a[k][j]){
		        same=false;
		        break;
		    }
		   }
		   if(same){
		   count++;}
		}
	}
		
	System.out.println(count);
}
}

//Row with maximum sum
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
}int max=0;
int row=0;
for(int i=0;i<n;i++){
    int count=0;
    for(int j=0;j<m;j++){
        if(a[i][j]==1){
            count++;
        }

if(max<count){
    max=count;
    row=i;
    
}
}
}
System.out.print(row+1);

	}
}

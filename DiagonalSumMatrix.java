 #input:
 #1 2 3
 #4 5 6
 #7 8 9
#output:
#1+5+9+3+5+7(primary and secondary diagonal sum)

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

int a[][]=new int[n][n];
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
    }
}
int sum1=0,sum2=0;
for(int i=0;i<n;i++){
           sum1=sum1+a[i][i];
           sum2=sum2+a[i][n-1-i];
}
           int sum=sum1+sum2;
if(n%2==1){
    sum=sum-a[n/2][n/2];
}
    System.out.print(sum);
  }
}
here n%2 used only for 3 cross 3 matrix

	}
}

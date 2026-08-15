// ip:
// 4
// 2 3
// 4 5
// 3 5
// 1 7
// 5 3
// op:
// Yes
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
		int ar[][]=new int[n][2];
		for(int i=0;i<n;i++){
		    ar[i][0]=sc.nextInt();
		    ar[i][1]=sc.nextInt();
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
	boolean found=false;
		for(int i=0;i<n;i++){
		if((ar[i][0]==a&&ar[i][1]==b)||(ar[i][0]==b&&ar[i][1]==a)){
		found=true;
		break;}
	}
		
		if(found)
		
			    System.out.println("yes");
	else
		    System.out.println("No");
		
	}
}

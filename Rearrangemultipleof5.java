//rearrang digits to get mutliple of 5
Input

3
3
115
3
103
3
119
  Output
Yes
Yes
No
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
   String s=sc.next();
   boolean found=false;
   for (int i=0;i<s.length();i++){
   if(s.charAt(i)=='5'||s.charAt(i)=='0'){
       found=true;
       break;
   }
}
    if(found){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    
    
}
	}
}

// input:
// HelloHowyoudoing H 2
// output:
// 5
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
String s=sc.next();
char ch=sc.next().charAt(0);
int k=sc.nextInt();
int count=0;
for(int i=0;i<s.length();i++){
    char c1=s.charAt(i);
    if(c1==ch){
        count++;
        if(count==k){
            System.out.println(i);
            return;
        }
    }
}
System.out.println("-1");


	}
}

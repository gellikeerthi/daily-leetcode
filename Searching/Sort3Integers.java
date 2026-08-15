ip:5 2 7
op:2 5 7
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int temp;
if(a>b){
    temp=a;
    a=b;
    b=temp;
}

if(a>c){
    temp=a;
    a=c;
    c=temp;
}
if(b>c){
    temp=b;
    b=c;
    c=temp;
}
System.out.println(a+" "+b+" "+c);
	}
}

          

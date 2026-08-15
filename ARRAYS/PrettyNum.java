//
// Vasya likes the number 239
// 239. Therefore, he considers a number pretty if its last digit is 2 or 3 or  9

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
    int l=sc.nextInt();
    int r=sc.nextInt();
    int count=0;
  
    for(int i=l;i<=r;i++){
        int rk=i%10;
        
        if(rk==2||rk==3||rk==9){
            count++;
        }
    }
    System.out.println(count);
}
	}
}

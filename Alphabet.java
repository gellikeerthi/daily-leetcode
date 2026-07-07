//input:
act
2
cat
dog
//output:
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
	String s=sc.next();
	int n=sc.nextInt();
while(n-->0){
	    String word=sc.next();
	  int count=0;
	    
	    for(int i=0;i<word.length();i++){

	        for(int j=0;j<s.length();j++){
	        if(word.charAt(i)==s.charAt(j)){
	            count++;
	            break;
	        }
	    }
	   
	}
	    if(count==word.length()){
	        System.out.println("Yes");
	    }else{
	        System.out.println("No");
	    }
	    
	    
}
	}
}

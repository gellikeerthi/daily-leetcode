import java.io.*;
import java.util.*;

public class Main {
public static int gcd(int a,int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   String p=sc.next();
   String q=sc.next();
   int len=gcd(p.length(),q.length());
   String s=p.substring(0,len);
   String p1="";
   while(p1.length()<p.length()){
    p1+=s;
   }
   String q1="";
   while(q1.length()<q.length()){
    q1+=s;
   }
   if(p.equals(p1)&&q.equals(q1)){
    System.out.println(s);
   }else{
    System.out.println("-1");
   }
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   long hash=0;
   for(int i=0;i<s.length();i++){
    int ascii=(int)s.charAt(i);
    
    hash+=(long)ascii*(int)Math.pow(11,i+1);
   }
   System.out.print(hash);
   
   
   
   
    }
}

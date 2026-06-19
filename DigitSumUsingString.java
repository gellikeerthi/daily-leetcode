
//here we used string becoz string can unlimited values rather than int has limited size
//use string and convert again in to int for adding values
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
      String s=sc.next();
        int sum=0;
       for(int i=0;i<s.length();i++){
        sum+=s.charAt(i)-'0';

                    }
    
    System.out.println(sum);
    }
}

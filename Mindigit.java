import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
     String s=sc.next();
     char min=s.charAt(0);
     for(int i=1;i<s.length();i++){
        if(s.charAt(i)<min){
            min=s.charAt(i);
        }
     }
     System.out.println(min);
    }
}

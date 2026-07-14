import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=s.length();
    for(int i=n-1;i>=1;i--){
String prefix=s.substring(0,i);
String suffix=s.substring(n-i);
if(prefix.equals(suffix)){
    System.out.println(i);
    return;
}
    }
    System.out.println("0");
    }
}

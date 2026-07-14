import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String a=sc.next();
    String b=sc.next();
    String temp=b+b;
if(temp.contains(a)){
    System.out.println("yes");
}else{
    System.out.println("no");
}
    
    }
}

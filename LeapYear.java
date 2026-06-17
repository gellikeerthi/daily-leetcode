import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   if(n%4==0&&n%100!=0||n%400==0){
    System.out.println("Yes");
   }else{
    System.out.println("No");
   }
    }
}

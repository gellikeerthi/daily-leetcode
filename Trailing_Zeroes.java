// Example
// Input
// 3
// 2
// 5
// 100

// Output
// 0
// 1
// 24

// Explanation

// 2! = 2 [No trailing zeros]
// 5! = 120 [Trailing zeros=1]
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
    
   long n=sc.nextLong();
   long count=0;
   while(n>=5){
    n=n/5;
    count+=n;
   }

System.out.println(count);
    }
    }
    
}

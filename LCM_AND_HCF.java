// Input
// 4
// 4 710
// 13 1
// 6 4
// 605904 996510762

// Output
// 1420 2
// 13 1
// 12 2
// 7740895599216 78

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t-->0){
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=a*b;
    while(b!=0){
        long rem=a%b;
        a=b;
        b=rem;
    }
long lcm=c/a;
System.out.println(lcm+" "+a);


  }
  
  
  
    }
}

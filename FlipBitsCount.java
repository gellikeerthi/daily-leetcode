// Input
// 4
// 20 10
// 16 8
// 1 153
// 549 24

// Output
// 4
// 2
// 3
// 6
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
    long x=a^b;
    int cnt=0;
    while(x>0){
        if((x&1)==1){
            cnt++;
        }
        x=x>>1;
    }
    System.out.println(cnt);




   }
   
   
   
    }
}

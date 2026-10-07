// Input
// 5
// 8
// pfyafafd
// 9
// sllwffoqq
// 6
// yoogvb
// 4
// hcch
// 23
// mzmqnnrkurfmmfrukrnnqsm

// Output
// 3
// 2
// 2
// 4
// 18

 import java.io.*;
import java.util.*;

public class Main {
static int check(String s,int n,int p1,int p2){
    
     while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
  p1--;
  p2++;
     }
    
     return p2-p1-1;
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        String s=sc.next();
int maxlen=0;
for(int i=0;i<n;i++){
 maxlen=Math.max(maxlen,check(s,n,i,i));
 maxlen=Math.max(maxlen,check(s,n,i,i+1));
    }
    System.out.println(maxlen);
    
    }
    }
}

// Input
// 2
// smart 3
// interviews 10

// Output
// vpduw
// sxdobfsogc
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        String s=sc.next();
        int k=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          sb.append((char)((ch-'a'+k)%26+'a'));

        }
            System.out.println(sb.toString());
        
    }
    
    
    
    }
}

import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
      
        int a[]=new int[n];
        for(int i=0;i<n;i++){
         int x=sc.nextInt();
         int min=Integer.MAX_VALUE;
       for(int b=0;b<=2;b++){
        if(x!=b){
min=Math.min(min,Math.abs(x-b));
        }
       }
        ans+=min;
       }
System.out.println(ans);
    }
}

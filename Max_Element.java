import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         class should be named Main. */
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         int i,max;
         for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         }
         max=a[0];
         for(i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
         }System.out.println(max);
    }
}

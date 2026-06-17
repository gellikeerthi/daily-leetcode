
#PRINT ARRAY A USING B
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();}
            for(int i=0;i<m;i++){
    if(b[i]>=n){
        System.out.print("-1"+" ");
    }else{
        System.out.print(a[b[i]]+" ");
    }
}
    

    }
}

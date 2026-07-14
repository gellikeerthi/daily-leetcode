import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        int count=0;
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
       for(i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
             if(a[i]==a[j]){
                count=a[i];;
             }
        }
       }System.out.println(count);
    }
}

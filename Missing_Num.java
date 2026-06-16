import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int a[]=new int[99];
        int sum=0;
        int k,n=100;
        for(int i=0;i<99;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<99;i++){
            sum=sum+a[i];
        }
        k=(n*(n+1))/2;
        System.out.println(k-sum);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x[]=new int[n];
    int y[]=new int[n];
    for(int i=0;i<n;i++){
        x[i]=sc.nextInt();
        y[i]=sc.nextInt();
    }
    long sum1=0;
    long sum2=0;

    for(int i=0;i<n;i++){
        int next=(i+1)%n;
        sum1+=(long)x[i]*y[next];
        sum2+=(long)y[i]*x[next];
    }
    System.out.println(Math.abs(sum1-sum2));    }
}

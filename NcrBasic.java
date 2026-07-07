import java.io.*;
import java.util.*;

public class Main {
public static long fact(int n){
long fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;}
return fact;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int r=sc.nextInt();
        long k=(fact(n))/(fact(n-r)*fact(r));
        System.out.println(k);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong(),e=sc.nextLong(),f=sc.nextLong();
      long mod=1000000007L;
       long k=((a%mod)*(b%mod))%mod;
       k=(k*(c%mod))%mod;
       long l=((d%mod)*(e%mod))%mod;
       l=(l*(f%mod))%mod;
long m=(k-l+mod)%mod;
System.out.println(m);


    }
}

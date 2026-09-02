import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=n;
        long res=1;
        for(int i=0;i<m;i++){
            res=res*k;
            }
            System.out.print(res);
    }
}
//BINARY EXPONENTIAL FORM
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        long a=sc.nextLong();
        long b=sc.nextLong();
        long res=1;
        long x=a;
        int m=(int)1e9+7;
        while(b>0){
            if(b%2!=0){
                res=(res*x)%m;
            }
            x=(x*x)%m;
            b=b>>1;
        }
            System.out.println(res);
            
        }
    }
    }

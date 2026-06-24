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

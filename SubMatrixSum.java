import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt(),j=sc.nextInt(),k=sc.nextInt(),l=sc.nextInt();
      int a[][]=new int[n][n];
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                a[r][c]=sc.nextInt();
            }
        }
        int sum=0;
        for(int r=i;r<=k;r++){
            for(int c=j;c<=l;c++){
                sum+=a[r][c];
            }
        }

System.out.print(sum);

    }
}

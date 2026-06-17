import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }   
        }
        int b[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[n][m];
              for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    c[i][j]=a[i][j]+b[i][j];
                }
              }
              for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
              }


    }
}

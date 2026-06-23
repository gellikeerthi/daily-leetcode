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
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
              if(a[i][j]==0){
              System.out.print("1"+" ");
              }else{
System.out.print("0"+" ");
              }
            }
            System.out.println();
        }



    }
}

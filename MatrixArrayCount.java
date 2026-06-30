//Input
3 4
5 9 -2 2
-3 4 1 9
2 -2 1 -2
5
5 1 -2 2 6

Output
3
1
4
//
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
        int k=sc.nextInt();
        int b[]=new int[k];
        for(int i=0;i<k;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                for(int f=0;f<k;f++){
                if(a[i][j]==b[f]){
                    count++;
                    break;
                }
                }
            }
        
        System.out.println(count);
        }
      
        
        
        
        
        
            }
}


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            a[i][j]=sc.nextInt();
        }
        }
        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=n-3;j++){
                int max=Integer.MIN_VALUE;
                for(int x=i;x<i+3;x++){
                    for(int y=j;y<j+3;y++){
                        if(a[x][y]>max){
                            max=a[x][y];
                        }
                    }
                }
            System.out.print(max+" ");
        }System.out.println();
        }

        

        
    }
}

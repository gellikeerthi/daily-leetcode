//if any element is zero make row and column as zero
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
        int row[]=new int[n];
        int col[]=new int[m];
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(a[i][j]==0){
           row[i]=1;
           col[j]=1;
        }
    }
}
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(row[i]==1||col[j]==1){
                a[i][j]=0;
            }
        }
    }

for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
}


    }
}

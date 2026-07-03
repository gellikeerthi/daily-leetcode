Input
 3
 5 9 -2 
 -3 4 1 
 2 6 1 

Output
 15
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
        }int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(i>=j){
                sum=sum+a[i][j];
            }
            }
        }

System.out.println(sum);
        
    }
}

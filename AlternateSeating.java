import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            if(a[i]==0){
        boolean left=(i==0)||(a[i-1]==0);
        boolean right=(i==m-1)||(a[i+1]==0);
        if(left&&right){
           a[i]=1;
            n--;
        }
            }

        }
        if(n<=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    
    }
}

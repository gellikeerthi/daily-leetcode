import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int[n];
 int k=0;
 for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(a[i]==b[j]){
            c[k]=a[i];
            k++;
            break;
        }
    }
 }
 for(int i=0;i<k;i++){
    boolean found=false;
    for(int j=0;j<i;j++){
        if(c[i]==c[j]){
        found=true;
            break;
        }
        }if(!found){
System.out.print(c[i]+" ");
        }
    
 }


    }
    }

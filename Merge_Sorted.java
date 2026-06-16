#MERGE SORTED ARRAYS
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
int c[]=new int[n+m];
int j=0,k=0;
i=0;
while(i<n&&j<m){
    if(a[i]<b[j]){
        c[k]=a[i];
        i++;
    }else{
        c[k]=b[j];
        j++;
    }
    k++;
}
while(i<n){
    c[k]=a[i];
    i++;
    k++;
}
while(j<m){
    c[k]=b[j];
    j++;
    k++;
}
   for(i=0;i<c.length;i++){
    System.out.print(c[i]+" ");
   }     
    }
}

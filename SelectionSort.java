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
for(int i=0;i<n-1;i++){
    int min=i;
    for(int j=i+1;j<n;j++){
        if(a[j]<a[min]){
            min=j;
        }
    }
    int temp=a[i];
    a[i]=a[min];
    a[min]=temp;
    for(int k=0;k<n;k++){
        System.out.print(a[k]+" ");
    }
System.out.println();
}







    }
}

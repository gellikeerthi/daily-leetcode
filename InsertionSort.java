// Input
// 5
// 8 7 1 2 4

// Output
// 7 8 1 2 4
// 1 7 8 2 4
// 1 2 7 8 4
// 1 2 4 7 8

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
    }int temp,i,j;
    for( i=1;i<n;i++){
        temp=a[i];
        for( j=i-1;j>=0&&a[j]>temp;j--){
a[j+1]=a[j];
        }
        a[j+1]=temp;
        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }
    
    
    }
}

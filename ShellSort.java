// Example
// Input
// 8
// 4 3 12 1 13 9 5 6

// Output
// 4 3 5 1 13 9 12 6
// 4 1 5 3 12 6 13 9
// 1 3 4 5 6 9 12 13

//for every gap we printed values not for every iteration

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
   for(int gap=n/2;gap>=1;gap=gap/2){
    for(int j=gap;j<n;j++){
        for(int i=j-gap;i>=0;i=i-gap){
            if(a[i]>a[i+gap]){
                int temp=a[i];
                a[i]=a[i+gap];
                a[i+gap]=temp;
                
            }
            }
    }
                for(int k=0;k<n;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            
        
    }
   }
   
   
   
    }

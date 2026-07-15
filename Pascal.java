// Input
//  10

// Output
//  1 
//  1 1 
//  1 2 1 
//  1 3 3 1 
//  1 4 6 4 1 
//  1 5 10 10 5 1 
//  1 6 15 20 15 6 1 
//  1 7 21 35 35 21 7 1 
//  1 8 28 56 70 56 28 8 1 
//  1 9 36 84 126 126 84 36 9 1 

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     
        for(int i=0;i<n;i++){
            int value=1;
            for(int j=0;j<=i;j++){
                System.out.print(value+" ");
                value=value*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

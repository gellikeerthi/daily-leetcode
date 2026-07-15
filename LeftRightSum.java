// Input
// 3
// 6 7 7

// Output
// 14 1 13

// Explanation

// At index 0:
// LeftSum = 0, RightSum = 14
// B[0] = | LeftSum - RightSum | = 14.

// At index 1:
// LeftSum = 6, RightSum = 7
// B[1] = | LeftSum - RightSum | = 1.

// At index 2:
// LeftSum = 13, RightSum = 0
// B[2] = | LeftSum - RightSum | = 13.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
        int right=sum-left-a[i];
        System.out.print(Math.abs(left-right)+" ");
        left+=a[i];
        }
    }
}

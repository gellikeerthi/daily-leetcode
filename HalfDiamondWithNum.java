
// Input
// 5 

// Output
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5
// 1 2 3 4 
// 1 2 3 
// 1 2 
1import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
System.out.print(j+" ");
        }
        System.out.println();
    }
    for(int i=1;i<=n-1;i++){
        for(int j=1;j<=n-i;j++){
System.out.print(j+" ");
        }
        System.out.println();
    }
    
    
    
    }
}

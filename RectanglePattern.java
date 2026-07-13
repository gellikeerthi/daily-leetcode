import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int star=n-1-i;
        for(int j=0;j<n;j++){
if(j==star){
    System.out.print("*");
}else{
    System.out.print(n-j);
}
        }
        System.out.println();
    }
    
    
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int w=sc.nextInt();
    int l=sc.nextInt()a;
    for(int i=0;i<l;i++){
        for(int j=0;j<w;j++){
if(i==0||i==l-1||j==0||j==w-1)
    System.out.print("*");
else
        System.out.print(" ");
        }
    System.out.println();
        }
    
    
    
    
    }
}

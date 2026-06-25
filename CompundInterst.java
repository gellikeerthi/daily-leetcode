import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt(),r=sc.nextInt(),n=sc.nextInt(),t=sc.nextInt();
        int k=p*((int)Math.pow((1+r/n),n*t))-p;
        System.out.println(k);    }
}

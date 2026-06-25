
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int d=b*b-4*a*c;
        double k=(-b+Math.sqrt(d))/(2.0 *a);
        double k2=(-b-Math.sqrt(d))/(2.0 *a);
        if(d<0){
            System.out.println("Imaginary Roots");
        }else{
        System.out.printf("%.2f %.2f",k,k2);
        }
    }
}

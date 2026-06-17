import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n;
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+r*r*r;
          n=n/10;
        }
        if(sum==k)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}

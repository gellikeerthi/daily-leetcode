// number should be divisible by sum of digits
// eg:n=18
//   18/(1+8) =2 yes
//   else no
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
          sum=sum+r;
            n=n/10;
        }
    
        if(temp%sum==0)
        System.out.println("Yes");
else
System.out.println("No");

    }
}

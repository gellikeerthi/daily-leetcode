catalan number =2ncn;
if they asked to print n catalan numbers
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {

            long f2n = 1;
            long fn = 1;

            for (int i = 1; i <= 2 * k; i++) {
                f2n *= i;
            }

            for (int i = 1; i <= k; i++) {
                fn *= i;
            }

            long ncr = f2n / (fn * fn);
            long catalan = ncr / (k + 1);

            System.out.print(catalan + " ");
        }
    }
}




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long f2n=1;
        long fn=1;
        for(int i=1;i<=2*n;i++){
            f2n=f2n*i;
        }
        for(int i=1;i<=n;i++){
            fn=fn*i;
        }
        long ncr=f2n/(fn*fn);
        long c=ncr/(n+1);
        System.out.println(c);
    }
}

//n-x=k
//  k should be a power of 2

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(int i=0;i<=n;i++){
            long num=n-i;
            if(num>0&&((num)&(num-1))==0){
                System.out.println(i);
                return;
            }
        }
    }
}

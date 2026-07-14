import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int freq[]=new int[1001];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            freq[a[i]]++;
        }
        int count=0;
        for(int i=0;i<1001;i++){
        count+=freq[i]/2;
        }
        System.out.print(count);
    }
}

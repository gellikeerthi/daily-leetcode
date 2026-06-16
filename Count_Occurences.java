#COUNT OCCURENCES OF POS NEG VALUES AND ZERO
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i,k=0,l=0,m=0;
    for(i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    for(i=0;i<a.length;i++){
        if(a[i]>0){
            k++;
        }else if(a[i]<0){
            l++;
        }else{
            m++;
        }
    }
    System.out.print(m+" "+k+" "+l);
    }
}

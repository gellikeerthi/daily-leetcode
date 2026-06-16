#UNIQUE ELEMENT
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            int freq=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                freq++;
                }
            }
        
            if(freq==1){
        System.out.print(a[i]+" ");}
        }
        
    }
}

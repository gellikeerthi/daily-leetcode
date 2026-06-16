MEAN_MEDIAN_MODE CODE
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i;
    double sum=0;
double mean=0;
    double median=0;
    for(i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    int mode=a[0];
    for(i=0;i<a.length;i++){
       sum=(double)sum+a[i];
    }
    Arrays.sort(a);
    if(n%2==0){
        median=(a[n/2-1]+a[n/2])/2.0;
    }else{
        median=a[n/2];
    }
    
    mean=sum/n;
    int maxc=0;
    for(i=0;i<a.length;i++){
        int count=0;
    for(int j=0;j<a.length;j++){
        if(a[i]==a[j]){
            count++;
        }
        if(count>maxc){
            maxc=count;
            mode=a[i];
        }
    }
    }
    System.out.printf("%.2f %.2f %d",mean,median,mode);
    
    }
}

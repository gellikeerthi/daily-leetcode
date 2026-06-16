import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
 
    int first=-1,last=-1;
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }int key=sc.nextInt();

for(int j=0;j<a.length;j++){
    if(a[j]==key){
      if(first==-1){
        first=j;
      }
      last=j;
    }
}System.out.println(first+" "+last);

    
    
    }
}

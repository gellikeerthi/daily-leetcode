import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
   int total=0;
   for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    total+=a[i];
   }
   int target=total/3;
int sum=0;
int count=0;
if(total%3!=0){
    System.out.println("false");
    return;
}
for(int i=0;i<n;i++){
    sum+=a[i];
    if(sum==target){
        count++;
        sum=0;   
    }

}
if(count>=3)
System.out.println("true");
else
System.out.println("false");


    }
}

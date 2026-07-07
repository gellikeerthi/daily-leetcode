import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        char a[]=s.toCharArray();
        char b[]=s1.toCharArray();
        if(s.length()!=s1.length()){
            System.out.println("FALSE");
        }else{
       for(int i=0;i<a.length-1;i++){
        for(int j=0;j<a.length-i-1;j++){
if(a[j]>a[j+1]){
    char temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;
}
        }
        }
for(int i=0;i<b.length;i++){
    for(int j=0;j<b.length-1;j++){
        if(b[j]>b[j+1]){
            char temp=b[j];
            b[j]=b[j+1];
            b[j+1]=temp;
        }
    }
}boolean same=true;
for(int i=0;i<a.length;i++){
    if(a[i]!=b[i]){
same=false;
break;
    }
}if(same){
    System.out.println("TRUE");
}else{
    System.out.println("FALSE");
}

        }
    }
}

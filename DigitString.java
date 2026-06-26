import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean t=false;
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
     
        if(ch>='0'&&ch<='9'){
        t=true;}
        else{
            t=false;
            break;
        }
    }
        if(t){
            System.out.println("Yes");
        }else{
        System.out.println("No");}
    }
}

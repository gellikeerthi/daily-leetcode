import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
         if(ch>='a'&&ch<='z'){
            ch=(char)('a'+(ch-'a'+k)%26);

         }else{
            ch=(char)('A'+(ch-'A'+k)%26);
         }

        
        System.out.print(ch);
        }
    }
}


//Small letter to big and big letter to small
//here we can also check like is char uppercase or lowercase
//Character.isUpperCase(ch) = to check whether letter is upper or not
//Character.toLowerCase(ch)=to convert letter in to lower
//Character.isLowerCase(ch)
//Character.toUpperCase(ch)
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=' ';
            if(ch>='A'&&ch<='Z'){
                ch1=Character.toLowerCase(ch);
              
        }else if(ch>='a'&&ch<='z'){
            ch1=Character.toUpperCase(ch);
        }
    System.out.print(ch1);
        }
        
    }
}

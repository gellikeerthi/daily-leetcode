import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int c=0;
      int c2=0;
      for(int i=0;i<s.length();i++){
char ch=Character.toLowerCase(s.charAt(i));

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
c++;
        }else{
            c2++;
        }
      }
        System.out.print(c+" "+c2);
    }
    
}

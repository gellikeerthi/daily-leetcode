// Input
//  smartinterviewssmart smart

// Output
//  Yes
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   String t=sc.next();
  if(s.startsWith(t)&&s.endsWith(t)){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }
   
    }
}
// Approach 2:
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   String t=sc.next();
  if(t.length()>s.length()){
    System.out.println("No");
  }else{
    String prefix=s.substring(0,t.length());
    String suffix=s.substring(s.length()-t.length());
  if(prefix.equals(t)&&suffix.equals(t)){
    System.out.println("Yes");
  }
  else{
    System.out.println("No");
  }
  }
   
    }
}

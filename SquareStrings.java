// If the length is odd, it can never be a square string.
// Divide the string into two equal halves.
// Compare the two halves.
// If they are equal, print "Yes", otherwise "No
// Example
// Input
//  aabaabaabaab

// Output
//  Yes
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    if(s.length()%2!=0){
        System.out.println("No");
        return;
    }
    int mid=s.length()/2;
    String first=s.substring(0,mid);
    String second=s.substring(mid);
    if(first.equals(second)){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    
    }
}

2
data structures
smart interviews

Output
srucures
ineview
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0){
    String a=sc.next();
    String b=sc.next();
    HashSet<Character>set=new HashSet<>();
   StringBuilder ans=new StringBuilder();
   for(int i=0;i<a.length();i++){
char ch=a.charAt(i);
set.add(ch);
   }
   for(int i=0;i<b.length();i++){
    char ch1=b.charAt(i);
   if(!set.contains(ch1))
   ans.append(ch1);
   }
   System.out.println(ans);
    }}
}

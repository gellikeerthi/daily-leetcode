// Example
// Input
// 10
// smart Ursula eerie code abyss Arjuna Expasito data Ace hacker
// 3
// 1 3
// 5 8
// 3 4

// Output
// 2
// 3
// 0
using brute force
import java.io.*;
import java.util.*;

public class Main {
static boolean isVowel(char ch){
   ch=Character.toLowerCase(ch);
return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String[] words=new String[n];
   for(int i=0;i<n;i++){
   words[i]=sc.next();
   }
   int q=sc.nextInt();
   while(q-->0){
   int i=sc.nextInt();
   int j=sc.nextInt();
   int cnt=0;
for(int k=i;k<=j;k++){
    String word=words[k];
    if(isVowel(word.charAt(0))&& isVowel(word.charAt(word.length()-1))){
        cnt++;
    }
}
System.out.println(cnt);
   
   
   }
    }
}
using prefix sum
import java.io.*;
import java.util.*;

public class Main {
static boolean isVowel(char ch){
   ch=Character.toLowerCase(ch);
return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int prefix[]=new int[n];
    for(int i=0;i<n;i++){
   String word=sc.next();
   int cnt=0;
    if(isVowel(word.charAt(0))&& isVowel(word.charAt(word.length()-1))){
        cnt=1;
    }
    prefix[i]=cnt;
    if(i>0){
        prefix[i]=prefix[i]+prefix[i-1];
    }
}
   int q=sc.nextInt();
   while(q-->0){
   int i=sc.nextInt();
   int j=sc.nextInt();
   int ans=prefix[j];
   if(i>0){
    ans=ans-prefix[i-1];
   }
System.out.println(ans);
   
   
   }
    }
}

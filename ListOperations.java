// Input
// 10
// append 13
// append 7
// insert 1 6
// extend
// index 2
// reverse
// index 7
// length
// sort
// count 6

// Output
// 13
// 13 7
// 13 6 7
// 13 6 7 13 6 7
// -1
// 7 6 13 7 6 13
// 0
// 6
// 6 6 7 7 13 13
// 2

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        ArrayList<Integer> list=new ArrayList<>(); 
        while(n-->0){
String cmd=sc.next();
if(cmd.equals("append")){
    int x=sc.nextInt();
    list.add(x);
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");}
    System.out.println();
}else if(cmd.equals("insert")){
    int pos=sc.nextInt();
    int x=sc.nextInt();
    list.add(pos,x);
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

else if(cmd.equals("extend")){
    ArrayList<Integer> temp=new ArrayList<>(list);
    list.addAll(temp);
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");}
        System.out.println();
    
}
else if(cmd.equals("reverse")){
    Collections.reverse(list);
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");}
        System.out.println();
    
}
else if(cmd.equals("sort")){
    Collections.sort(list);
    for(int i=0;i<list.size();i++){
System.out.print(list.get(i)+" ");}
System.out.println();
    
}
else if(cmd.equals("length")){
        System.out.println(list.size());
}
else if(cmd.equals("index")){
    int x=sc.nextInt();
    System.out.println(list.indexOf(x));
}
else if(cmd.equals("count")){
    int x=sc.nextInt();
    int count=0;
    for(int i=0;i<list.size();i++){
        if(list.get(i)==x){
            count++;
        }
    }
    System.out.println(count);
}



        }
    }
}

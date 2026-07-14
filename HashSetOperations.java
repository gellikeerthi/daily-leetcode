import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   HashSet<Integer> a=new HashSet<>();
   for(int i=0;i<n;i++){
    a.add(sc.nextInt());
   }
   int m=sc.nextInt();
   HashSet<Integer> b=new HashSet<>();
   for(int i=0;i<m;i++){
   b.add(sc.nextInt());
   }
   TreeSet<Integer> union=new TreeSet<>(a);
union.addAll(b);
printSet(union);
TreeSet<Integer>inter=new TreeSet<>(a);
inter.retainAll(b);
printSet(inter);
TreeSet<Integer> sym=new TreeSet<>(union);
TreeSet<Integer> temp=new TreeSet<>(inter);
sym.removeAll(temp);
printSet(sym);
System.out.println(Collections.disjoint(a,b));
System.out.println(b.containsAll(a));
System.out.println(a.containsAll(b));}

  static void printSet(TreeSet<Integer> set)
{
    if(set.isEmpty()){
        return;
    }
    for(int x:set){
        System.out.print(x+" ");
    }
    System.out.println();
}   
    
}

1.brute force=>hashset o(n^2)
2.Optimal code
  using hashmap will reduce the time complexity o(n*h)
  instead of creating hashset every time we just move one step by incrementing i and j
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result=new ArrayList<>();
        // code here
        for(int i=0;i<=arr.length-k;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
           result.add(set.size());
        }
        return result;
    }
}
Optimal code
  using hashmap will reduce the time complexity o(n*k)
  instead of creating hashset every time we just move one step by incrementing i and j
  import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0){
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
  HashMap<Integer,Integer>map=new HashMap<>();
 for(int i=0;i<k;i++){
    map.put(a[i],map.getOrDefault(a[i],0)+1);
 }
 System.out.print(map.size()+" ");
 int i=0;
 int j=k;
 while(j<n){
    map.put(a[i],map.get(a[i])-1);
    if(map.get(a[i])==0){
        map.remove(a[i]);
    }
    map.put(a[j],map.getOrDefault(a[j],0)+1);
    System.out.print(map.size()+" ");
    i++;
    j++;
 }
 System.out.println();

   
   
   
   }
    }
}

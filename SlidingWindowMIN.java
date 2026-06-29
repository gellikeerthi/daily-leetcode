
//Finding the subarray with mimum sum
import java.util.Scanner;

public class Main {
    public static long findMinSumSubarray(int n, int k, int[] arr) {
        // Write your code here
        int l=0;
        int r=k-1;
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        long min=sum;
        while(r<n-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum+=arr[r];
            if(min>sum){
                min=sum;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(findMinSumSubarray(n, k, arr));
    }
}

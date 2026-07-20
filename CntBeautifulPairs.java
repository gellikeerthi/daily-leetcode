ip:
4
4 4 2 2
op:
4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        //Write your code here
        int k=0;
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(a[i]==a[j]*a[j]){
                   k++;
           }
            }
        }
        System.out.println(k);
    }
}

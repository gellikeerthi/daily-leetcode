// input:
// 3 3
// 3 1 5
// 8 2 1
// 4 6 0
// output:
// 4 6 0
// 8 2 1
// 3 1 5


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();

        }




    }
}

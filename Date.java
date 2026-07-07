//input:
//4
//21/05/2001
//10/15/2069
//05/11/1999
//29/02/2024
//output:
//DD/MM/YYYY
//MM/DD/YYYY
//BOTH
//DD/MM/YYYY

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
int a=(s.charAt(0)-'0')*10+(s.charAt(1)-'0');
int b=(s.charAt(3)-'0')*10+(s.charAt(4)-'0');
if(a>12){
    System.out.println("DD/MM/YYYY");
}else if(b>12){
    System.out.println("MM/DD/YYYY");
}else{
    System.out.println("BOTH");
}
            // Your code goes here
        }
    }
}

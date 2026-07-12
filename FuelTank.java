import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int main=sc.nextInt();
        int add=sc.nextInt();
        int dis=0;
        while(main>0){
            if(main>=5){
                main=main-5;
                dis=dis+50;
            if(add>0){
                main++;
                add--;
            }
            }
            else{
                dis=dis+main*10;
                break;
            }
        }
        System.out.println(dis);
    }
}

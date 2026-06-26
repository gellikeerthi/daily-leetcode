import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=sc.nextInt();
for(int i=1;i<n;i++){
    char op=sc.next().charAt(0);
    int num=sc.nextInt();
    switch(op){
        case '+':ans+=num;break;
        case '-':ans-=num;break;
        case '*':ans*=num;break;
        case '/':ans/=num;break;
        case '%':ans%=num;
        if(ans<0){
            ans+=num;
            break;
    }
}
    }
    System.out.println(ans);
}
}

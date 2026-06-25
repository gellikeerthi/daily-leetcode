import java.io.*;
import java.util.*;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s2=sc.next();
        LocalDate d1=LocalDate.parse(s);
        LocalDate d2=LocalDate.parse(s2);
        long days=Math.abs(ChronoUnit.DAYS.between(d1,d2));
        System.out.print(days);

    }
}

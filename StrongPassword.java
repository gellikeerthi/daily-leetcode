import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
boolean digit=false;
boolean lower=false;
boolean upper=false;
boolean special=false;
String sp="!@#$%^&*()+-";
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(Character.isDigit(ch)){
        digit=true;
    }else if(Character.isLowerCase(ch)){
        lower=true;
    }else if(Character.isUpperCase(ch)){
        upper=true;
    }else if(sp.indexOf(ch)!=-1){
special=true;
    }
}
int miss=0;
if(!digit)miss++;
 if(!upper)miss++;
 if(!lower)miss++;
 if(!special) miss++;
int needlen=6-s.length();
if(needlen<0){
    needlen=0;
}
System.out.println(Math.max(miss,needlen));

        }
    }

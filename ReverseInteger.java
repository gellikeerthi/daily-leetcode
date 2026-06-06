//Problem: Reverse Integer
//Leetcode:007
//Difficulty:Medium
class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
       int r=x%10;
       x=x/10;
        if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10){   (//if size exceeds it cant be stored in int,to check whether the number exceeds integer size or not  )
        return 0;}
        rev=rev*10+r;}
        return rev;
    }
}

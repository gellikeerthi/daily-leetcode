//Check ith bit is set or not
//left shift (n&(1<<i))!=0 yes else no
class Solution {
    public boolean checkIthBit(int n, int i) {
        // Your code goes here
        if(((n>>i)&1)!=0){
        return true;}
        return false;
    }
}

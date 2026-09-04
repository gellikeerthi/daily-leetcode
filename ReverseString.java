// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
 
class Solution {
    public void reverseString(char[] s) {
    int first=0;
    int last=s.length-1;
        for(int i=0;i<s.length;i++){
if(first<last){
     char temp=s[first];
    s[first]=s[last];
 s[last]=temp;
    first++;
    last--;
}
        }
    }
}

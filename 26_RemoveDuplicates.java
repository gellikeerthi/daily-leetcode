Problem:Remove duplicates from sorted array
leetcode:26
Difficulty:medium
class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0; //i is unique element j is used for traversal
       for(int j=1;j<nums.length;j++){
          if(nums[j]!=nums[i]){
            nums[i+1]=nums[j];
            i++;
          }
       }
        return i+1;     
    }
}

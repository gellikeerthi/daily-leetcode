// input:
// 5
// 0 1 1 0 1
// output:
// 2
public static int findMaxConsecutiveOnes(int[] nums) {
        //write code here...
        int maxcount = 0, count = 0, k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) 
            {
                count++;
                if (maxcount < count) {
                    maxcount = count;
                }
             } 
            else {
                count = 0;
            }
        }
        return maxcount;
}

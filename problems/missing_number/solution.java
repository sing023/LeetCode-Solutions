class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length ==1) {
            if (nums[0] == 1) {
                return 0;
            }   else {
                return 1;
            }
        } 
        int totalSum = nums.length * (nums.length+1)/ 2;
        for (int i :nums ) {
            totalSum -= i;
        }
        return totalSum;
    }
}
class Solution {
    public int rob(int[] nums) {

        if (nums.length==0) {
            return 0;
        }
        if (nums.length==1) {
            return nums[0]; 
        }
        int accPrev = nums[0];
        int accPrev2 =0;
        int currentBest =0;

        for (int i=1; i<nums.length; i++) {
            currentBest = Math.max(accPrev,accPrev2 + nums[i]);
            
            accPrev2= accPrev;
            accPrev = currentBest;

        }
        return currentBest;
    }
}
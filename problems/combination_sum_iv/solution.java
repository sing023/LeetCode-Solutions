class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] memoizationArr = new int[target+1];
        memoizationArr[0] = 1;

        for(int i=1; i<memoizationArr.length; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    memoizationArr[i] += memoizationArr[i - num];
                }
            }  
        }
        // System.out.println(Arrays.toString(memoizationArr));
        return memoizationArr[target];
    }
}
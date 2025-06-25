class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum =0;
        for (int i: nums) {
            totalSum +=i;
        }
        if (totalSum % 2 == 1 ) {
            return false;
        }

        int targetHalf = totalSum/2;
        boolean[] isNum = new boolean[targetHalf +1];
        isNum[0] = true;

        for (int num: nums) {
            for (int i=targetHalf; i >=num; i-- ) {
                isNum[i] = isNum[i] || isNum[i -num];
            }
        }
        return isNum[targetHalf];
    }
}
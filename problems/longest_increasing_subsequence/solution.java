class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> traps = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {

            int left =0;
            int right = traps.size()-1;
            while(left<=right) {
                int mid = left + (right-left)/2;
                if (traps.get(mid)>=nums[i]) {
                    right = mid-1;
                }   else {
                    left = mid+1;
                }
            }
            if (left<traps.size()) {
                traps.set(left,nums[i]);
            }   else {
                traps.add(nums[i]);
            }
            
        }
        return traps.size();
    }
}
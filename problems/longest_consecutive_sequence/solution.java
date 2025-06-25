class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); 
        }

        int maxAnsw = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentMax = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentMax++;
                }
                maxAnsw = Math.max(maxAnsw, currentMax);
            }
        }

        return maxAnsw;
    }
}
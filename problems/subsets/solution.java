class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> answ = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        
        answ = generateSubsets(0,nums,currentList,answ);
        return answ;
    }

    public List<List<Integer>> generateSubsets(int i, int[] nums,List<Integer> currentList, List<List<Integer>> answ  ) {

        if (i == nums.length) {
            answ.add(new ArrayList<>(currentList));
            return answ;
        }

        currentList.add(nums[i]);         
        answ = generateSubsets(i+1,nums,currentList,answ);

        currentList.remove(currentList.size()-1);
        answ = generateSubsets(i+1,nums,currentList,answ);
        
        return answ;
    }
}
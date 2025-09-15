class Solution {
    public int findKthLargest(int[] nums, int k) {
        int answ =0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums) {
            maxHeap.add(i);
        }
        
        for(int i=0; i<k; i++) {
            answ = maxHeap.poll();
        }
        return answ;
    }
}
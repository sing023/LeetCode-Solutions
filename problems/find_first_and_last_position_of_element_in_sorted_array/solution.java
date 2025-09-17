class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=left + (right-left)/2;
        int[] answArr = new int[2];
        int leftMost =-1;
        int rightMost =-1;

        while(left<=right) {
            mid = left + (right-left)/2;
            if (nums[mid]>target) {
                right = mid-1;
            }   else if (nums[mid]<target) {
                left = mid+1;
            }   else {
                leftMost = mid;
                right = mid-1; // go left when found the target
            }
        }
        if (leftMost ==-1 ) {
            return new int[]{-1,-1};
        }
        answArr[0]=leftMost;
        left = mid;
        right = nums.length-1;

        while(left<=right) {
            mid = left + (right-left)/2;
            if (nums[mid]>target) {
                right = mid-1;
            }   else if (nums[mid]<target) {
                left = mid+1;
            }   else {
                rightMost = mid;
                left = mid+1; // go right even when found target
            }
        }

        if (rightMost ==-1 ) {
            return new int[]{-1,-1};
        }
        answArr[1]=rightMost;
        return answArr;
    }
}
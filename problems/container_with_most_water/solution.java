class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length -1;
        int vol = 0;
        while (left != right) {
            int currentVol= Math.min(height[left],height[right])*(right-left);           
            if (currentVol>vol) {
                vol = currentVol;
            }
            if (height[left]>height[right]) {
                right -=1;
            }   else {
                left +=1;
            }
        }
        return vol;
    }
}
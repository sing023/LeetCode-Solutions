class Solution {
    public int uniquePaths(int m, int n) {   
        int lower = Math.min(m-1,n-1);
        int total = m+n -2;
        long totalUniquePaths=1;
        for (int i=1; i<lower+1; i++) {
            totalUniquePaths = totalUniquePaths *(total-i+1) /i;
        }  
        return (int) totalUniquePaths;
    }
}
class Solution {
    public int countSubstrings(String s) {
        int count =0;
        int n = s.length();
        int left,right=0;
        for (int i=0; i<s.length(); i++) {
            left=i;
            right=i;

            while (left>=0 && right < n && s.charAt(left) == s.charAt(right)) {
                count+=1;
                left-=1;
                right+=1;
            }

            left = i;
            right = i+1;
            while (left>=0 && right < n && s.charAt(left) == s.charAt(right)) {
                count+=1;
                left-=1;
                right+=1;
            }

        }
        return count;
    }
}
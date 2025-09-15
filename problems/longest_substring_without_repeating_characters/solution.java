class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength =0;
        int left=0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            while(set.contains(c)) {
                set.remove(s.charAt(left));
                left +=1;
            }   
            set.add(c);
            maxLength = Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}
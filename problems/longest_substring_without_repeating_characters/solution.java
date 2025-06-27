class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> duplicates = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (duplicates.contains(c)) {
                duplicates.remove(s.charAt(left));
                left++;
            }

            duplicates.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
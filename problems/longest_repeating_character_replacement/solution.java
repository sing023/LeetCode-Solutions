class Solution {
    public int characterReplacement(String s, int k) {
        int[] charFreqs = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            charFreqs[c - 'A']++;

            // Update maxFreq of any character in current window
            maxFreq = Math.max(maxFreq, charFreqs[c - 'A']);

            // If we need to replace more than k characters, shrink window
            if ((right - left + 1) - maxFreq > k) {
                charFreqs[s.charAt(left) - 'A']--;
                left++;
            }
            // Update result
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
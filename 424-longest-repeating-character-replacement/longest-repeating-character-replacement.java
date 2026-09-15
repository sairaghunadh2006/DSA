class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;
        int maxFreq = 0;
        int max = 0;

        int[] freq = new int[26];

        for (int j = 0; j < s.length(); j++) {
            freq[s.charAt(j) - 'A']++;
            maxFreq = Math.max(
                maxFreq,
                freq[s.charAt(j) - 'A']
            );

            // If we need more than k replacements,
            // shrink the window
            while ((j - i + 1) - maxFreq > k) {

                freq[s.charAt(i) - 'A']--;
                i++;
            }
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}
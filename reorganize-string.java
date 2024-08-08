class Solution {
    public String reorganizeString(String s) {
        
     int n = s.length();
        int[] count = new int[26];

        // Step 1: Count frequencies of each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Use Character array instead of char array
        Character[] sortedChars = new Character[26];
        for (int i = 0; i < 26; i++) {
            sortedChars[i] = (char) (i + 'a');
        }

        // Sort characters by frequency
        Arrays.sort(sortedChars, (a, b) -> count[b - 'a'] - count[a - 'a']);

        // Step 3: Place characters in the result array
        char[] result = new char[n];
        int index = 0;

        // Fill even indices first
        for (char c : sortedChars) {
            while (count[c - 'a'] > 0 && index < n) {
                result[index] = c;
                index += 2;
                count[c - 'a']--;
            }
        }

        // Fill odd indices next
        index = 1;
        for (char c : sortedChars) {
            while (count[c - 'a'] > 0 && index < n) {
                result[index] = c;
                index += 2;
                count[c - 'a']--;
            }
        }

        // Step 4: Check if rearrangement is possible
        for (int i = 1; i < n; i++) {
            if (result[i] == result[i - 1]) {
                return ""; // Adjacent characters are the same, not possible
            }
        }

        return new String(result);
    }
}

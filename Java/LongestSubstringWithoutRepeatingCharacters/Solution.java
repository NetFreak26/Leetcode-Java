class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndexes = new HashMap<> ();
        int n = s.length();

        int start = 0;
        int maxLen = 0;
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            if (lastIndexes.get(c) != null && lastIndexes.get(c) >= start) {
                maxLen = Math.max(maxLen, i-start);
                start = lastIndexes.get(c) + 1;
            }
            lastIndexes.put(c, i);
        }
        maxLen = Math.max(maxLen, n-start);
        return maxLen;
    }
}

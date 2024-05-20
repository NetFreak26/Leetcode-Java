class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();

        int maxLen = 0;
        String pal = "";
        for (int i=0; i<len; i++) {
            int l = i;
            int r = i + 1;

            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }

            if (r - l - 1 > maxLen) {
                maxLen = r - l - 1;
                pal = s.substring(l+1, r);
            }

            l = i - 1;
            r = i + 1;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }

            if (r - l - 1 > maxLen) {
                maxLen = r - l - 1;
                pal = s.substring(l+1, r);
            }

            System.out.print(maxLen);
            System.out.println(pal);
        }
        return pal;
    }
}

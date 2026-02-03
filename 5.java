class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        int start = 0, end = 0;

        for (int index = 0; index < s.length(); index++) {
            int len1 = expand(s, index, index);
            int len2 = expand(s, index, index + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = index - (len - 1) / 2;
                end = index + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

class Solution {
    public String longestPrefix(String s) {
		int length = s.length();
		int[] lps = new int[length];

		int j = 0;

		for (int i = 1; i < length; i++) {
			while (j > 0 && s.charAt(i) != s.charAt(j)) {
				j = lps[j - 1];
			}

			if (s.charAt(i) == s.charAt(j)) {
				j++;
			}

			lps[i] = j;
		}

		int prefixLength = lps[length - 1];
		return s.substring(0, prefixLength);
	}
}

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder ans = new StringBuilder();
        int cycle = 2 * (numRows - 1);

        for (int row = 0; row < numRows; row++) {
            for (int index = row; index < s.length(); index += cycle) {
                ans.append(s.charAt(index));

                int diag = index + cycle - 2 * row;
                if (row != 0 && row != numRows - 1 && diag < s.length()) {
                    ans.append(s.charAt(diag));
                }
            }
        }
        return ans.toString();
    }
}

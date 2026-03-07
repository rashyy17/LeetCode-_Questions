class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int value : nums) {
            if (value > 0) {
                ans[posIndex] = value;
                posIndex += 2;
            } else {
                ans[negIndex] = value;
                negIndex += 2;
            }
        }

        return ans;
    }
}

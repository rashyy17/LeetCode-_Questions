class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int ans = 0;

        while (a >= b) {
            int power = 0;
            while (a >= (b << power)) {
                power++;
            }
            power--;
            a -= b << power;
            ans += 1 << power;
        }

        return sign ? -ans : ans;
    }
}

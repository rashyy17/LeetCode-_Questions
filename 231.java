class Solution {
    public boolean isPowerOfTwo(int value) {
        if (value <= 0) return false;
        return (value & (value - 1)) == 0;
    }
}


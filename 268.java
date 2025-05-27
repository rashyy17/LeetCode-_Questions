class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
        for(int num:nums){
            xor1=xor1^num;
        }
        int xor2=0;
        for(int i=0;i<=nums.length;i++){
            xor2=xor2^i;
        }
        return xor1^xor2;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int s=Integer.MIN_VALUE;    
        int cs=0;
        for(int i:nums){
            cs+=i;
            if(cs>s){
                s=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        return s;
    }
}

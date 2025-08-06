class Solution {
    int dp(int[] nums,int s2){
        int t[][]=new int[nums.length+1][s2+1];
        for(int i=0; i<=nums.length; i++){
            t[i][0] = 1; // sum 0 is always possible (empty subset)
        }
        for(int i=1;i<nums.length+1;i++){
            for(int j=0;j<s2+1;j++){
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i-1][j-nums[i-1]];
                }
                else t[i][j]=t[i-1][j];
            }
        }
        return t[nums.length][s2];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int s=0;
        for(int n:nums){
            s+=n;
        }
        if ((s + target) % 2 != 0 || Math.abs(target) > s) return 0;
        int s2=(s+target)/2;
        return(dp(nums,s2));
    }
}

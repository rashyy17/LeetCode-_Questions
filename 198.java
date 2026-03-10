class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];
        if(n<2) return dp[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }        
        return dp[n-1];
    }
}


// Approach:
// till house 1-> dp[0] 
// till house 2-> max of first two houses
// actual computation starts from 3rd house.
// dp[i] will be max of dp[i-1] (until last house max money) and sum of dp[i-2]+nums[i] (sum till {i-2}th house and current house)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ws=0;
        for(int i=0;i<k;i++){
            ws+=nums[i];
        }
        int ms=ws;
        for(int i=0;i<nums.length-k;i++){
            ws=ws-nums[i]+nums[k+i];
            if(ws>ms) ms=ws;
        }
        return (double)ms/(double)k;
    }
}

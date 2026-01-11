class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,max=0;
        int k2=k,c=0;
        int len=nums.length;
        while(r<len){
            if(nums[r]==0){
                c++;
            }
            while(c>k){
                if(nums[l]==0) c--;
                l++;
            }
            r++;
            max=Math.max(max,r-l);
        }
        return max;
    }
}

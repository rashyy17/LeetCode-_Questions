class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[(i+1)%nums.length]<nums[i]){
                c++;
            }
        }
        return c<=1;
    }
}

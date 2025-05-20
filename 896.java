class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean one=true;
        boolean two=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) one=false;
            if(nums[i]>nums[i+1]) two=false;
        }
        return one||two;
    }
}

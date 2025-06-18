class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int m=0;
        while(s<=e){
            m=(e+s)/2;
            if(nums[m]==target) return m;
            else if(nums[m]<target){
                s=m+1;
            }
            else if(nums[m]>target){
                e=m-1;
            }
        }
        return s;
    }
}

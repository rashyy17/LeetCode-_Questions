class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        if(nums.length==0) return -1;
        if(nums.length==1 && nums[0]==target) return 0;
        while(i<=j){
            int m=(i+j)/2;
            if(target==nums[m]) return m;
            if(target>nums[m]){
                i=m+1;
            }
            else if(target<nums[m]){
                j=m-1;
            }
        }
        return -1;
    }
}

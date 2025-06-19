class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        int start=bin(nums,target,true);
        int end=bin(nums,target,false);
        return new int[] {start,end};
    }
    int bin(int[] nums, int target,boolean start){
        int s=0,e=nums.length-1,ans=-1;
        while(s<=e){
            int m=(s+e)/2;
            if(target>nums[m]){
                s=m+1;
            }
            else if(target<nums[m]){
                e=m-1;
            }
            else{
                ans=m;
                if(start){
                    e=m-1;
                }
                else s=m+1;
            }
        }
        return ans;
    }
}

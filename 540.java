class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=0;
        if(nums.length==1){
            return nums[0];
        }
        else if(nums.length==2 && nums[0]==nums[1]){
            return nums[0];
        }
        else if(nums.length==3){
            if(nums[0]==nums[1]){
                return nums[2];
            }
            else if(nums[1]==nums[2]){
                return nums[0];
            }
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]==nums[i] || nums[i]==nums[i+1]){
                if(nums[i+1]!=nums[i] && i+1==nums.length-1){
                    return nums[i+1];
                }
                else if(nums[i-1]!=nums[i] && i-1==0){
                    return nums[0];
                }
            }
            else ans=nums[i];
        }
        return ans;
    }
}

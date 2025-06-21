class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int c=nums[i]-1;
            if(nums[i]!=nums[c]){
                int t=nums[i];
                nums[i]=nums[c];
                nums[c]=t;
            }
            else i++;
        }
        int ans=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans =nums[j];
            }
        }
        return ans;
    }
}

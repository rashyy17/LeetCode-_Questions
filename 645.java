class Solution {
    public int[] findErrorNums(int[] nums) {
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
        int[] ans=new int[2];
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
            ans[0]=nums[k];
            ans[1]=k+1;
            break;
            }
        }
        return ans;
    }
}

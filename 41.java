class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int c=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length &&  nums[i]!=nums[c] ){
                int t=nums[i];
                nums[i]=nums[c];
                nums[c]=t;
            }
            else{
                i++;
            }
        }
        int j=0;
        for( j=0;j<nums.length;j++){
            if( nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}

class Solution {
    public void nextPermutation(int[] nums) {
        int first_dec=0;
        int in=0;
        for(int i=nums.length-1;i>0;i-- ){
            if(nums[i-1]<nums[i]){
                first_dec=i-1;
                in=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i-- ){
            if(nums[i]>nums[first_dec]){
                int temp=nums[i];
                nums[i]=nums[first_dec];
                nums[first_dec]=temp;
                break;
            }
        }
        int l=nums.length-1;
        while(in<l){
            int t=nums[in];
            nums[in]=nums[l];
            nums[l]=t;
            in++;
            l--;
        }
    }
}

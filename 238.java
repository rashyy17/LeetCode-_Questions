class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int[] ans=new int[nums.length];
        arr1[0]=nums[0];
        arr2[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            arr1[i]=nums[i]*arr1[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            arr2[j]=nums[j]*arr2[j+1];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=arr2[i+1];
            }
            else if(i==nums.length-1){
                ans[i]=arr1[i-1];
            }
            else ans[i]=arr1[i-1]*arr2[i+1];
        }
        return ans;
    }
}

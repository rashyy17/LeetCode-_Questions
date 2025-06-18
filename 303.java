class NumArray {
    int[] nums2;
    public NumArray(int[] nums) {
        int n=nums.length;
        nums2=new int[n];
        nums2[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            nums2[i]=nums[i]+nums2[i-1];
        }

    }
    
    public int sumRange(int left, int right) {
        
        if(left==0) return nums2[right];
        return nums2[right]-nums2[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

class Solution {
    public int splitArray(int[] nums, int k) {
        int s=0,e=0;
        for(int i=0;i<nums.length;i++){
            s=Math.max(s,nums[i]);
            e+=nums[i];
        }
        
        while(s<e){
            int m=s+(e-s)/2;
            int sum=0,peices=1;
            for(int num : nums){
                if(sum+num>m){
                    sum=num;
                    peices++;
                }
                else{
                    sum+=num;
                }
            }
            if(peices>k){
                s=m+1;
            }
            else {
                e=m;
            }
        }
        return e;
    }
}

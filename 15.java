class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        for(int k=0;k<nums.length;k++){
            if (nums[k] > 0) break;
            if(k>0 &&(nums[k])==nums[k-1]) {
                continue;
            }
            int i=k+1,j=nums.length-1;
            int s=0;
            while(i<j){
                s=nums[i]+nums[j]+nums[k];
                if(s==0){
                    List<Integer> onelist=new ArrayList<>();
                    onelist.add(nums[k]);
                    onelist.add(nums[i]);
                    onelist.add(nums[j]);
                    l.add(onelist);
                    while(i<j && (nums[i]==nums[i+1])) i++;
                    while(i<j && (nums[j]==nums[j-1])) j--;
                    i++;
                    j--;
                }
                else if(s<0){
                    i++;
                }
                else if(s>0){
                    j--;
                }
            }
        }
        return l;
    }
}

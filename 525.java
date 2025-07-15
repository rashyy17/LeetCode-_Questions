class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int s=0;
        int maxlen=0;
        hm.put(0, -1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(hm.containsKey(s)){
                int first_instance=hm.get(s);
                maxlen=Math.max(maxlen,i-first_instance);
            }
            else{
                hm.put(s,i);
            }
        }
        return maxlen;
    }
}

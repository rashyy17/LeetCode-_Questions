class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        int r=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.getFirst()<=(i-k)){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i>=k-1) ans[r++]=nums[dq.peekFirst()];
        }
        return ans;
    }
}

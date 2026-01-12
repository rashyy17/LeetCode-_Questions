class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer, Integer> hm=new HashMap<>();
        int ans[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                st.pop();
            } 
            if(st.isEmpty()){
                hm.put(nums2[i],-1);
            }
            else hm.put(nums2[i],nums2[st.peek()]);
            st.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }
}

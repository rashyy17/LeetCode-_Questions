class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long s_os=0,s_ol=0;
        Stack<Integer> st=new Stack<>();
        int pse[]=new int[n];
        int nse[]=new int[n];
        int ple[]=new int[n];
        int nle[]=new int[n];
        int mod=1000000007;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            pse[i]=(st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            ple[i]=(st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            nse[i]=(st.isEmpty())?n:st.peek();
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            nle[i]=(st.isEmpty())?n:st.peek();
            st.push(i);
        }

        for(int i=0;i<n;i++){
            long right_s=nse[i]-i;
            long left_s=i-pse[i];
            long right_l=nle[i]-i;
            long left_l=i-ple[i];
            s_os+=(right_s*left_s*nums[i]);
            s_ol+=(right_l*left_l*nums[i]);
        }
        return s_ol-s_os;
    }
}

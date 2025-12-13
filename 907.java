class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long sum=0;
        int mod=1000000007;
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int[] pse=new int[n];
        int[] nse=new int[n]; 
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            pse[i]=(!st.isEmpty())?st.peek():-1;
            st.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty() && arr[st2.peek()]>arr[i]){
                st2.pop();
            }
            nse[i]=(!st2.isEmpty())?st2.peek():n;
            st2.push(i);
        }
        for(int i=0;i<n;i++){
            long right=i-pse[i];
            long left=nse[i]-i;
            long min=(right*left*arr[i])%mod;
            sum=(sum+min)%mod;
        }
        return (int) sum%mod;
    }
}

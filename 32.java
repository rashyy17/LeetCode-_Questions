class Solution {
    public int longestValidParentheses(String str) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    maxLen=Math.max(maxLen,i-st.peek());
                }
            }
        }
        return maxLen;
    }
}

// Approach:
// use stack.
// first push -1 as a base.
// for loop thru string.
// if ch==( push
// else {
//     pop.
//     now if stack is empty push current index, so that length calculation is done from there then onwards.
//     otherwise if stack has values, calculate max value

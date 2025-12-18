class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            int x = num.charAt(i);
            while(!st.isEmpty() && st.peek()>x && k>0){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k > 0 && !st.isEmpty()) {
    st.pop();
    k--;
}
         StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        sb.reverse();

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') i++;

        String ans = sb.substring(i);
        return ans.length() == 0 ? "0" : ans;
    }
}

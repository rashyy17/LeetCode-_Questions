class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int pse[]=new int[heights.length];
        int nse[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                st.pop();
            }
            pse[i]=(st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        for(int i=heights.length-1;i>=0;i--){
            while(!st2.isEmpty() && heights[st2.peek()]>=heights[i]){
                st2.pop();
            }
            nse[i]=(st2.isEmpty())?heights.length:st2.peek();
            st2.push(i);
        }
        int area=0;
        for(int i=0;i<heights.length;i++){
            area=Math.max(area,(nse[i]-pse[i]-1)*heights[i]);
        }
        return area;
    }
}

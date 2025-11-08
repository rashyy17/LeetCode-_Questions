class MinStack {
    Stack<Long> st=new Stack<>(); 
    long min=Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push((long)val);
            min=val;
        }
        else if(val<min){
            long new_val=2*(long)val-min;
            min=val;
            st.push((long)new_val);
        }
        else{
            st.push((long)val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        long n=st.pop();
        if(n<min){
            min=2*min-n;
        }
    }
    
    public int top() {
        long t=st.peek();
        if(st.peek()>min){
            return (int) t;
        }
        else{
            return (int) min;
        }
    }

    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int d=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(d>0) res.append(c);
                d++;
            }
            else{
                if(d>1) res.append(c);
                d--;
            }
        }
        return res.toString();
    }
}

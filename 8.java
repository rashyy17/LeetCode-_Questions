class Solution {
    public int myAtoi(String s) {
        int sign=1,digit=0;
        long f_result=0;
        boolean started=false;
        for(char c:s.toCharArray()){
            if(c==' ' && started==false) {
                continue;
            }
            if(c=='+' && started==false) {
                sign=1;
                started=true;
                continue;
            }
            if(c=='-' && started==false) {
                sign=-1;
                started=true;
                continue;
            }
            if(!Character.isDigit(c)){
                break;
            }
            digit=c-'0';
            f_result=f_result*10+digit;
            started=true;
            if(sign==1 && f_result>Integer.MAX_VALUE ) return Integer.MAX_VALUE;
            if(sign==-1 && -f_result<Integer.MIN_VALUE ) return Integer.MIN_VALUE;
        }
        return (int)(sign*f_result);
    }
}

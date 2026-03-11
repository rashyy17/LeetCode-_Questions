class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        boolean b=false;
        int ind=0;
        for(int i=n-1;i>=0;i--){
            char ch=num.charAt(i);
            int c=ch-'0';
            if(c%2==1){
                ind=i;
                b=true;
                break;
            }
        }
        if(b==false) return "";
        return num.substring(0,ind+1);
    }
}

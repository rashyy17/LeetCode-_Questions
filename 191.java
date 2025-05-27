class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>1){
            if((n&1)==1) c++;
            n=n>>>1;
        }
        if(n==1) c++;
        return c;
    }
}

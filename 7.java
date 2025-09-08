class Solution {
    public int reverse(int x) {
        boolean b=false;
        if(x<0){
            x=-x;
            b=true;
        }
        int val=x;
        long rev=0;
        while(val>0){
            int last=val%10;
            rev=rev*10+last;
            val/=10;
        }
        if(b){
            rev=-rev;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}

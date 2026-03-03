class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        for(int i:piles){
            r=Math.max(r,i);
        }
        while(l<r){
            int m=l+(r-l)/2;
            int tot=0;
            for(int banana:piles){
                // tot+=(int)Math.ceil(banana/m);
                // ✅ Correct Fix (Best Way — No Math.ceil)
                // Use integer trick:
                tot += (banana + m - 1) / m;
            }
            if(tot>h){
                l=m+1;
            }
            else{
                r=m;
            }
        }
        return l;
    }
}

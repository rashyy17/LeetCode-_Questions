class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int ar1=Math.min(height[l],height[r])*(r-l);
            if(height[l]<height[r]){
                l++;
            }
            else r--;
            ans=Math.max(ans,ar1);
        }
        return ans;
    }
}

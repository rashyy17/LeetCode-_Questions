class Solution {
    public int trap(int[] height) {
        int[] prefix=new int[height.length];
        int[] suffix=new int[height.length];
        int n=height.length;
        prefix[0]=height[0];
        // for(int i=1;i<n;i++){
        //     prefix[i]=Math.max(prefix[i-1],height[i]);
        // }
        // suffix[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //     suffix[i]=Math.max(suffix[i+1],height[i]);
        // }
        // int t=0;
        // for(int i=0;i<n;i++){
        //     if(height[i]<prefix[i] && height[i]<suffix[i]){
        //         t+=Math.min(prefix[i],suffix[i])-height[i];
        //     }
        // }
        // return t;
        Approach one [dp kinda, not most optimal spacewise]:
        - make two arrays, prefix and suffix, that hold max prefix and max suffix for each element in height.
        - now again iterate through height, if height[i] is less than both prefix and suffix, it is holding water. 
        (keep adding this water to a variable, by finding min between prefix[i] and suffix[i] and subtracting height)



            
        int l=0,r=height.length-1;
        int lmax=0,rmax=0;
        int t=0;
        while(l<r){
            if(height[l]< height[r]){
                if(height[l]>=lmax){
                    lmax=height[l];
                }
                else{
                    t+=lmax-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rmax){
                    rmax=height[r];
                }
                else{
                    t+=rmax-height[r];
                }
                r--;
            }
        }
        return t;


         Approach two [2 pointers n time and 1 space] (best soln):
        check while loop with l<r cond,
        then check if(height[l]<hieght[r])....go to the part with lesser value (as that will trap water)
        update lmax/rmax if height[i] is greater.
        otherwise calculate trapped water and add to the answer.
    }
}

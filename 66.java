class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length-1;
        boolean all=false;
        for(int num:digits){
            if(num==9){
                all=true;
            }
            else {all=false;
            break;}
        }
        if(all==true) {
            l++;
            int[] ans=new int[l+1];
            ans[0]=1;
            return ans;
        }
        if(digits[l]==9 ){
            
            if(digits[l]==9 && l>0 && digits[l-1]==9 ){
                int c=0;
                for(int n:digits){
                    if(n==9){
                        c++;
                    }
                }
                if(c==(l+1)){
                    l++;
                    int[] ans=new int[l+1];
                    ans[0]=1;
                    return ans;
                }
                else{
                    for(int i=l;i>=0;i--){
                        if(digits[i]==9){
                           digits[i]=0; 
                        }
                        else {digits[i]++;
                        break;}
                    }
                }
            }
            else{
            while(digits[l]==9 && l>0 ){
                digits[l]=0;
                digits[l-1]++;
            }
            }
        }
        else digits[l]+=1;
        return digits;
    }
}

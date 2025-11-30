class Solution {
    public boolean lemonadeChange(int[] bills) {
        int rem=0;
        int f=0;
        int ten=0;
        int tw=0;
        for(int n: bills){
            if (n==5) {
                f+=1;
            }
            else if(n==10){
                ten++;
                f--;
            }
            else if(n==20){
                tw++; 
                if(ten==0){
                    f-=3;
                }
                else{
                    ten--;
                    f--;
                }
            }
            if(f<0 ||ten<0||tw<0) return false;
        }
        return true;
    }
}

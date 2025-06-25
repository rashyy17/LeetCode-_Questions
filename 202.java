class Solution {
    public boolean isHappy(int n) {
        int s=n,f=n;
        do{
            s=sos(s);
            f=sos(sos(f));
        }while(s!=f);

        if (s==1) return true;
        else return false;
    }
    int sos(int n){
        int s=0;
        while(n>0){
            s+=(n%10)*(n%10);
            n=n/10;
        }
        return s;
    }
    
}

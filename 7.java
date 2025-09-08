class Solution {
    public int reverse(int x) {
        boolean neg=false;
        if (x<0) 
        {neg=true;
        x*=-1;
        }
        int l=0;
        int x2=x;
        while(x2>0){
            l++;
            x2/=10;
        }
        int no0=l-1;
        long x3=0;
        while(x>0){
            x3+=Math.pow(10,no0)*(x%10);
            x/=10;
            no0--;
        }
        
        if(x3>Integer.MAX_VALUE || x3<Integer.MIN_VALUE) return 0;
        if(neg) return (int)(-1*x3);
        return (int)x3;
    }
}

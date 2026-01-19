class Solution {
    public int countPrimes(int n) {
        boolean[] arr=new boolean[n];
        if (n<=2) return 0;
        for(int i=2;i<n;i++){
            arr[i]=true;
        }
        for(int p=2;p*p<n;p++){
            if(arr[p]==true){
                for(int multiple=p*p;multiple<n;multiple+=p){
                    arr[multiple]=false;
                }
            }
        }
        int c=0;
        for(boolean i:arr){
            if(i==true) c++;
        }
        return c;
    }
}

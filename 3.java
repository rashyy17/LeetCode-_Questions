class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[1000];
        int r=0,l=0,max=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(l)]--;
                l++;
            }
            max=Math.max(r-l+1,max);  
            r++;  
        }
        return max;
    }
}

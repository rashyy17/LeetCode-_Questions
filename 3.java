class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        else{
        int maxl=1;
        for(int i=0;i<s.length();i++){
            HashSet<Character> hs=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(hs.contains(s.charAt(j))==false){
                    hs.add(s.charAt(j));
                }
                else break;
                if(hs.size()>maxl){
                    maxl=hs.size();
                }
            }
        }
        return maxl;
        }
    }
}

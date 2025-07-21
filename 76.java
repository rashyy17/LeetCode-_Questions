class Solution {
    public String minWindow(String s, String t) {
         if (s.length() == 0 || t.length() == 0) return "";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<t.length();i++){
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        }

        int l=0,minlen=Integer.MAX_VALUE,start=0;
        int matched=0;
        HashMap<Character,Integer> window=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(hm.containsKey(c) && window.get(c).intValue()<=hm.get(c).intValue()){
                matched++;
            }
            while(matched==t.length()){
                if(minlen>(r-l+1)){
                    minlen=r-l+1;
                    start=l;
                }
                char leftc=s.charAt(l);
                window.put(leftc,window.get(leftc)-1);
                if(hm.containsKey(leftc) && window.get(leftc)<hm.get(leftc)){
                    matched--;
                }
                l++;
            }
        }
        return (minlen==Integer.MAX_VALUE)?"":s.substring(start,start+minlen);
    }
}

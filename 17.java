class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.isEmpty()) return ans;
        String[] codes={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        pad("",digits,codes,ans);

        return ans;
    }
    static void pad(String p,String up,String[] codes,List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return ;
        }
        int digit=up.charAt(0)-'0';//to convert to int we do -'0'
        for(int i=0;i<codes[digit].length();i++){
            char ch=codes[digit].charAt(i);
            pad(p+ch,up.substring(1),codes,ans); 
        }

    }
}

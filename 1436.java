class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> hs= new HashMap<>();
        for(int i=0;i<paths.size();i++){
            for(int j=0;j<2;j++){
                String s=paths.get(i).get(j);
                if(hs.containsKey(s)){
                    hs.put(s,2);
                }
                else hs.put(s,1);
            }            
        }
        for(int i=0;i<paths.size();i++){
            String s=paths.get(i).get(1);
            if(hs.get(s)==1){
                return s;
            }
        }
        return "";
    }
}

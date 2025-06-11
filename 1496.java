class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> hs=new HashSet<>();
        hs.add("0,0");
        int x=0,y=0;
        String p="";
        for(char ch:path.toCharArray()){
            if(ch=='N') x++;
            else if (ch=='S') x--;
            else if (ch=='E') y--;
            else if (ch=='W') y++;
            p=x+","+y;
            if(!hs.add(p)) return true;
            else hs.add(p);
        }
        return false;
    }
}

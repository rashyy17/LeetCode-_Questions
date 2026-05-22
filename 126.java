 import java.util.*;

class pair{
    String s;
    List<String> path;

    pair(String s,List<String> path){
        this.s=s;
        this.path=path;
    }
}

class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> ans=new ArrayList<>();

        HashSet<String> hs=new HashSet<>(wordList);

        if(!hs.contains(endWord)){
            return ans;
        }

        Queue<pair> q=new LinkedList<>();

        List<String> start=new ArrayList<>();
        start.add(beginWord);

        q.add(new pair(beginWord,start));

        int level=1;

        HashSet<String> used=new HashSet<>();

        while(!q.isEmpty()){

            pair p=q.poll();

            String w=p.s;

            if(p.path.size()>level){

                level=p.path.size();

                for(String str:used){
                    hs.remove(str);
                }

                used.clear();
            }

            if(w.equals(endWord)){

                if(ans.size()==0 || p.path.size()==ans.get(0).size()){
                    ans.add(p.path);
                }
            }

            char chars[]=w.toCharArray();

            for(int i=0;i<chars.length;i++){

                char curr=chars[i];

                for(char c='a';c<='z';c++){

                    chars[i]=c;

                    String newone=new String(chars);

                    if(hs.contains(newone)){

                        List<String> temp=new ArrayList<>(p.path);

                        temp.add(newone);

                        q.add(new pair(newone,temp));

                        used.add(newone);
                    }
                }

                chars[i]=curr;
            }
        }

        return ans;
    }
}

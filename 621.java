class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        PriorityQueue<Integer> heap=new PriorityQueue<>((f,s)->s-f);
        for(int i:freq){
            if(i>0){
                heap.offer(i);
            }
        }
        int tt=0;
        while(!heap.isEmpty()){
            int cycle=n+1;
            List<Integer> left=new ArrayList<>();
            int tasks_done=0;
            while(cycle>0 && !heap.isEmpty()){
                int rem=heap.poll();
                rem--;
                tasks_done++;
                if(rem>0){
                    left.add(rem);
                }
                cycle--;
            }
            for(int l:left){
                heap.offer(l);
            }
            if(heap.isEmpty()){
                tt+=tasks_done;
            }else{
                tt+=n+1;
            }
        }
        return tt;
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> l=new ArrayList<>();
        for(int[] n:intervals){
            if(l.isEmpty()||l.get(l.size()-1)[1]<n[0]){
                l.add(n);
            }
            else{
                int[] last=l.get(l.size()-1);
                last[1]=Math.max(n[1],last[1]);
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}

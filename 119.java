class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else row.add(al.get(i-1).get(j-1)+al.get(i-1).get(j));
            }
            al.add(row);
        }
    return al.get(rowIndex);
    }
    
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                   row.add(1); 
                }
                else{
                    row.add(ls.get(i-1).get(j-1)+ls.get(i-1).get(j));
                }
            }
            ls.add(row);
        }
        return ls;
    }
}

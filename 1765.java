class Solution {
    class pair{
        int x,y;
        pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length;
        int m=isWater[0].length;
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    isWater[i][j]=0;
                    q.add(new pair(i,j));
                }
                else isWater[i][j]=Integer.MAX_VALUE-1;
            }
        }
        int[][] dirs={{0,-1},{1,0},{0,1},{-1,0}};
        while(!q.isEmpty()){
            int x=q.peek().x;
            int y=q.peek().y;
            q.poll();
            for(int i=0;i<4;i++){
                int nx=x+dirs[i][0];
                int ny=y+dirs[i][1];
                if(nx<0||ny<0||nx>=n||ny>=m) continue;
                if(isWater[nx][ny]>isWater[x][y]+1){
                    isWater[nx][ny]=isWater[x][y]+1;
                    q.add(new pair(nx,ny));
                }
            }
        }
        return isWater;
    }
}

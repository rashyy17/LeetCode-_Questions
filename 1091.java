class Solution {
    static class node{
        int d;
        int x,y;
        node(int d,int x,int y){
            this.d=d;
            this.x=x;
            this.y=y;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dx[]={0,-1,-1,-1,0,1,1,1};
        int dy[]={-1,-1,0,1,1,-1,0,1};
        if(grid[0][0]!=0 ||grid[m-1][n-1]!=0) return -1;
        PriorityQueue<node> q=new PriorityQueue<>((a,b)->a.max-b.max);
        q.add(new node(1,0,0));
        grid[0][0]=1;
        while(!q.isEmpty()){
            node curr=q.poll();
            int d=curr.d;
            int x=curr.x;
            int y=curr.y;
            if(x==m-1 && y==n-1) return curr.d;
            for(int i=0;i<8;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx<m&& nx>=0 && ny<n && ny>=0) {
                    if(grid[nx][ny]==0){
                        grid[nx][ny]=1;
                        q.add(new node(d+1,nx,ny));
                    }
                }
            }
        }
        return -1;
    }
}

class Solution {
    static class node{
        int max;
        int x,y;
        node(int max,int x,int y){
            this.max=max;
            this.x=x;
            this.y=y;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<node> q=new PriorityQueue<>((a,b)->a.max-b.max);
        int[] dx={0,-1,0,1};
        int[] dy={-1,0,1,0};
        int min=Integer.MAX_VALUE;
        q.add(new node(0,0,0));
        vis[0][0]=0;
        while(!q.isEmpty()){
        node curr=q.poll();
        int max=curr.max;
        int x=curr.x;
        int y=curr.y;
        if(x==m-1 && y==n-1){
            min=Math.min(min,max);
        }
        for(int k=0;k<4;k++){
            int nx=x+dx[k];
            int ny=y+dy[k];
            if(nx<heights.length && nx>=0 && ny<heights[0].length && ny>=0 ) {
                int max_n=Math.max(max,Math.abs(heights[nx][ny]-heights[x][y]));
                if(vis[nx][ny]>max_n){
                    vis[nx][ny]=max_n;
                    q.add(new node(max_n,nx,ny));   
                }
                
            }
        }
        }
        return min;
    }
}

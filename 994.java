//revised
class Solution {
    class tri{
        int t,r,c;
        tri(int r,int c,int t){
            this.t=t;
            this.r=r;
            this.c=c;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<tri> q=new LinkedList<>();
        int[][] vis = new int[n][m];
        int FreshCnt=0;
        int hasfresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new tri(i,j,0));
                    vis[i][j]=2;
                }
                else if(grid[i][j]==1){
                    FreshCnt++;
                }
            }
        }
        int cnt=0,tm=0;
        int rows[]=new int[]{0,-1,0,+1};
        int cols[]=new int[]{-1,0,+1,0};
        while(!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            int t=q.peek().t;
            q.poll();
            
            
            for(int i=0;i<4;i++){
                    int nrow=r+rows[i];
                    int ncol=c+cols[i];
                    tm=t;
                if(nrow>=0 && nrow <n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 &&vis[nrow][ncol]!=2){
                    
                    q.add(new tri(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                     cnt++;
                }
            }
        }
                    if(cnt==FreshCnt) return tm;
                    else if (FreshCnt==0) return 0;
                    else return -1;

    }
}

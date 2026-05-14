class Solution {
    public void bfs(int i,int[][]isConnected,int[] vis){
        vis[i]=1;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && vis[j]==0){
                bfs(j,isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int vis[]=new int[n+1];
        int ans=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                bfs(i,isConnected,vis);
                ans++;
            }
        }
        return ans;
    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        int t[][]=new int[r][c];
        t[0][0]=1;
        if (obstacleGrid[0][0] == 1) return 0;
        for(int i=1;i<r;i++){
            if(obstacleGrid[i][0]==0){
                t[i][0]=t[i-1][0];
            }
            else{
                t[i][0]=0;
            }
        }
        for(int j=1;j<c;j++){
            if(obstacleGrid[0][j]==0){
                t[0][j]=t[0][j-1];
            }
            else{
                t[0][j]=0;
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(obstacleGrid[i][j]==0){
                    t[i][j]=t[i-1][j]+t[i][j-1];
                }
            }
        }
        return t[r-1][c-1];
    }
}

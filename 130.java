class Solution {
    class pair{
        int x,y;
        pair(int i,int j){
            this.x=i;
            this.y=j;
        }
    }
    public void bfs(int i,int j,char[][] board){
        int n = board.length;
        int m = board[0].length;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(i,j));
        int[][] dirs={{0,-1},{-1,0},{0,1},{1,0}};
         board[i][j]='#';
        while(!q.isEmpty()){
            int x=q.peek().x;
            int y=q.peek().y;
            q.poll();
            for(int[] dir:dirs){
                int nx=x+dir[0];
                int ny=y+dir[1];
                if(nx>=0 && ny>=0 && nx<board.length && ny<board[0].length && board[nx][ny]=='O' ){
                    board[nx][ny]='#';
                    q.add(new pair(nx,ny));
                }
            }
        }
         
       
    }

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && (i==0 || i==(n-1) || j==0 || j==(m-1)) ) {
                    bfs(i, j, board);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 'O')
    board[i][j] = 'X';

else if(board[i][j] == '#')
    board[i][j] = 'O';
            }
        }
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        // Initialize queue with all 0s
        // Mark 1s as unvisited
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        // Multi-source BFS
        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int x = cur[0];
            int y = cur[1];

            for (int[] d : dirs) {
                int nx = x + d[0];
                int ny = y + d[1];

                // Boundary check
                if (nx < 0 || ny < 0 || nx >= m || ny >= n)
                    continue;

                // Relaxation step
                if (mat[nx][ny] > mat[x][y] + 1) {
                    mat[nx][ny] = mat[x][y] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }

        return mat;
    }
}

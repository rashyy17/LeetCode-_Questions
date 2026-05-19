class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        // Step 1: Scan the left and right columns for edge 'O's
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][cols - 1] == 'O') dfs(board, i, cols - 1);
        }

        // Step 2: Scan the top and bottom rows for edge 'O's
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[rows - 1][j] == 'O') dfs(board, rows - 1, j);
        }

        // Step 3: Final sweep to flip captured 'O's to 'X' and revert 'T's to 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X'; // Captured!
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O'; // Safe, revert to original
                }
            }
        }
    }

    // Helper method to mark all connected 'O's as 'T'
    private void dfs(char[][] board, int i, int j) {
        int rows = board.length;
        int cols = board[0].length;

        // Base case: Out of bounds, or the current cell is not an 'O'
        if (i < 0 || j < 0 || i >= rows || j >= cols || board[i][j] != 'O') {
            return;
        }

        // Mark the current cell as safe
        board[i][j] = 'T';

        // Explore all 4 directions recursively
        dfs(board, i + 1, j); // Down
        dfs(board, i - 1, j); // Up
        dfs(board, i, j + 1); // Right
        dfs(board, i, j - 1); // Left
    }
}

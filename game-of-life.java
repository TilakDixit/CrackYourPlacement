class Solution {
    public void gameOfLife(int[][] board) {
        // Define the dimensions of the board
        int m = board.length, n = board[0].length;
        
        // Iterate over every cell in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Count live neighbors
                int count = life(board, i - 1, j - 1) + life(board, i - 1, j) + life(board, i - 1, j + 1) +
                            life(board, i, j - 1) + life(board, i, j + 1) +
                            life(board, i + 1, j - 1) + life(board, i + 1, j) + life(board, i + 1, j + 1);
                
                // Apply the rules and mark the changes
                if (board[i][j] == 1 && (count < 2 || count > 3)) {
                    board[i][j] = 2; // 1->0 (live to dead)
                }
                if (board[i][j] == 0 && count == 3) {
                    board[i][j] = -1; // 0->1 (dead to live)
                }
            }
        }
        
        // Update the board to the next state
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
                if (board[i][j] == -1) {
                    board[i][j] = 1;
                }
            }
        }
    }

    private int life(int[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return 0;
        }
        return board[i][j] == 1 || board[i][j] == 2 ? 1 : 0; // 2 means the cell was alive but now is dead
    }
}

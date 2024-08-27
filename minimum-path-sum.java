class Solution {
    public int minPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        // Initialize a 2D array to store minimum path sums
        int[][] dp = new int[m][n];

        // Initialize the first cell
        dp[0][0] = grid[0][0];

        // Fill in the first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill in the first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Calculate minimum path sums for the rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        // The value at dp[m-1][n-1] is the minimum path sum
        return dp[m - 1][n - 1];
        
    }
}

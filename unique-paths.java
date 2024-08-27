class Solution {
    public int uniquePaths(int m, int n) {
     int[][] dp = new int[m][n];

        // Initialize the first row and first column with 1 (only one way to reach each cell)
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill in the array using dynamic programming
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The answer is stored in dp[m-1][n-1]
        return dp[m - 1][n - 1];
        
    }
}

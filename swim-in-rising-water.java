class Solution {
     private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int swimInWater(int[][] grid) {
         int n = grid.length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[n][n];
        minHeap.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
         while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int time = curr[0], row = curr[1], col = curr[2];
            
            
            if (row == n - 1 && col == n - 1) {
                return time;
            }
         for (int[] direction : DIRECTIONS) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];
                
                
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    
                    minHeap.offer(new int[]{Math.max(time, grid[newRow][newCol]), newRow, newCol});
                }
            }
        }
        
        return -1;
    }
}

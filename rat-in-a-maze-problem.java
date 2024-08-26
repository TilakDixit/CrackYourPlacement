  private static boolean isValid(int[][] mat, int x, int y, boolean[][] visited) {
        int n = mat.length;
        return (x >= 0 && x < n && y >= 0 && y < n && mat[x][y] == 1 && !visited[x][y]);
    }

    // Function to find all paths from (0, 0) to (n-1, n-1)
    private static void findPaths(int[][] mat, int x, int y, boolean[][] visited, String path, List<String> paths) {
        int n = mat.length;

        // If destination is reached, add the path to the list
        if (x == n - 1 && y == n - 1) {
            paths.add(path);
            return;
        }

        // Mark the cell as visited
        visited[x][y] = true;

        // Move Down
        if (isValid(mat, x + 1, y, visited)) {
            findPaths(mat, x + 1, y, visited, path + "D", paths);
        }

        // Move Left
        if (isValid(mat, x, y - 1, visited)) {
            findPaths(mat, x, y - 1, visited, path + "L", paths);
        }

        // Move Right
        if (isValid(mat, x, y + 1, visited)) {
            findPaths(mat, x, y + 1, visited, path + "R", paths);
        }

        // Move Up
        if (isValid(mat, x - 1, y, visited)) {
            findPaths(mat, x - 1, y, visited, path + "U", paths);
        }

        // Unmark the cell (backtrack)
        visited[x][y] = false;
    }

    // Main function to find all paths
    public static ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> paths = new ArrayList<>();
        int n = mat.length;
        boolean[][] visited = new boolean[n][n];

        // If the source cell is blocked, return empty list
        if (mat[0][0] == 0) {
            return paths;
        }

        findPaths(mat, 0, 0, visited, "", paths);
        return paths;
    
   
       
       
        // Your code here
    }
}

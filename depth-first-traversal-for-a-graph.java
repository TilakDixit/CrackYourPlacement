class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
          ArrayList<Integer> ap = new ArrayList<>();
           boolean[] visited = new boolean[V];
           dfs(0,adj,ap,visited);
           return ap;
    }
    private void dfs(int node ,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ap, boolean[] visited ){
        
         ap.add(node);
         visited[node]=true;
          for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                  dfs(neighbor,adj,ap,visited);
                }
            }
    }
}

class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int fresho=0;
        Queue <int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]==2){
                    q.add(new int[]{i,j});
               }else if(grid[i][j]==1){
                   fresho++;
               }
            }
        }
        if(fresho==0){
            return 0;
        }
      int time=0;
     int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
      while(!q.isEmpty()){
          int size = q.size();
          boolean allrotten=false;
           for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int x = current[0];
                int y = current[1];
          for(int[]d:direction){
              int X=x+d[0];
              int Y=y+d[1];
                if (X >= 0 && X < n && Y >= 0 && Y < m && grid[X][Y] == 1) {
                        // Rot this fresh orange
                        grid[X][Y] = 2;
                        q.add(new int[]{X, Y});
                        fresho--;
                        allrotten = true;
                    }
          }
         
          
           }
       if (allrotten){ time++;}
      
    
}
     return fresho == 0 ? time : -1;
}}

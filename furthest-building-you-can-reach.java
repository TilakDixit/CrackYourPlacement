class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int h = heights[i + 1] - heights[i];
            
           if(h>0){
              minHeap.add(h);
              if(minHeap.size()>ladders){
                 bricks -= minHeap.poll();

              }
              if (bricks < 0) {
                    return i;
                }
           }}
        // If all buildings are reachable, return the index of the last building
        return heights.length - 1;
    }
}
        
    

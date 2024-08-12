class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int count=0;
        int maxreach=startFuel;
        int index=0;
         PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
         while(maxreach<target){
            while(index<stations.length&&stations[index][0]<=maxreach){
                pq.offer(stations[index][1]);
                 index++;
            }
            if(pq.isEmpty()){
                return -1;

            }
           maxreach+= pq.poll();
            count++;
           
         }
         return count;
        
    }
}

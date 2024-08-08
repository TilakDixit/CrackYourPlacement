class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int result=0;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                maxHeap.add(matrix[i][j]);
            }
         }
         for(int i=0;i<k-1;i++){
            maxHeap.poll();
         }
         result= maxHeap.poll();
         return result;

        
    }
}

class Solution {
   
    public int[] maxSlidingWindow(int[] nums, int k) {
         if (nums.length < k) {
            return new int[]{};
        }
        int[] result = new int[nums.length - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            
            if (i >= k - 1) {
                while (map.get(pq.peek()) == 0) {
                    pq.poll();
                }
                result[i - k + 1] = pq.peek();
                
                int outElement = nums[i - k + 1];
                map.put(outElement, map.get(outElement) - 1);
            }
        }
        
        return result;
    }
}

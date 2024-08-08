class GfG
{
    
       int maxLen(int arr[], int n) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;
        
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Update prefix sum
            prefixSum += arr[i];
            
            // Check if the prefix sum is zero (from the start to the current index)
            if (prefixSum == 0) {
                maxLength = i + 1;
            }
            
            // If the prefix sum has been seen before, update the max length
            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            } else {
                // Store the first occurrence of the prefix sum
                map.put(prefixSum, i);
            }
        }
        
        return maxLength;}
}

class NumArray {
     private int[] prefixSum;

    public NumArray(int[] nums) {
       int n = nums.length;
       prefixSum = new int[n + 1]; // Create a prefix sum array with one extra element for easier calculations

        // Build the prefix sum array
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }
        
    
    
    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

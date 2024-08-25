class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
          int ans = Integer.MIN_VALUE;
        int product = 1;
        // Traverse the array from left to right
        for (int i = 0; i < n; i++) {
            product *= nums[i];
            ans = Math.max(ans, product);
            if (nums[i] == 0) {
                product = 1;
            }
        }
          product = 1;
 
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            product *= nums[i];
            ans = Math.max(ans, product);
            if (nums[i] == 0) {
                product = 1;
            }}return ans;
        
    }
}

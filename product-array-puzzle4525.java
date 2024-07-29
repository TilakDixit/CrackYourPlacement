class Solution {
    public static long[] productExceptSelf(int nums[], int n) {
        long totalProduct = 1;
        int zeroCount = 0;

        // First pass: Calculate the total product and count zeros
        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }

        long[] result = new long[n];

        // Second pass: Populate the result array
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                result[i] = 0;  // More than one zero in the array means all products are zero
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    result[i] = totalProduct;  // Only place the total product at the zero's position
                } else {
                    result[i] = 0;  // All other positions are zero
                }
            } else {
                result[i] = totalProduct / nums[i];  // Regular case with no zeros
            }
        }

        return result;
    }
}

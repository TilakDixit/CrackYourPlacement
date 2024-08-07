class Solution {
    public int nthUglyNumber(int n) {
               int[] ugly = new int[n];
        ugly[0] = 1; 

        
        int i2 = 0, i3 = 0, i5 = 0;
        
       
        int nextMultipleOf2 = 2;
        int nextMultipleOf3 = 3;
        int nextMultipleOf5 = 5;
        
        
        for (int i = 1; i < n; i++) {
            // The next ugly number is the minimum among the next multiples of 2, 3, and 5
            int nextUglyNumber = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
            ugly[i] = nextUglyNumber;
            
            // Increment the pointer for the next multiple of 2, 3, or 5
            if (nextUglyNumber == nextMultipleOf2) {
                i2++;
                nextMultipleOf2 = ugly[i2] * 2;
            }
            if (nextUglyNumber == nextMultipleOf3) {
                i3++;
                nextMultipleOf3 = ugly[i3] * 3;
            }
            if (nextUglyNumber == nextMultipleOf5) {
                i5++;
                nextMultipleOf5 = ugly[i5] * 5;
            }
        }
        
        // Return the nth ugly number
        return ugly[n - 1];
    }
}

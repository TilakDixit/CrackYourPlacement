class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        // Calculate the sum of the last `k` elements
        int windowSum = 0;
        for (int i = n - k; i < n; i++) {
            windowSum += cardPoints[i];
        }
        
        // Initial maximum score
        int maxScore = windowSum;
        
        // Sliding window approach to find the maximum score
        for (int i = 0; i < k; i++) {
            windowSum = windowSum - cardPoints[n - k + i] + cardPoints[i];
            maxScore = Math.max(maxScore, windowSum);
        }
        
        return maxScore;
    }
}

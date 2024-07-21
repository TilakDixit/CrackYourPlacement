import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        // Initialize max value to the smallest possible integer value
        int max = Integer.MIN_VALUE;
        
        // Deque to store the indices of the points
        Deque<Integer> deque = new LinkedList<>();
        
        // Traverse through each point in the array
        for (int i = 0; i < points.length; i++) {
            // Remove elements from the front if they are out of range (xj - xi > k)
            while (!deque.isEmpty() && points[i][0] - points[deque.peekFirst()][0] > k) {
                deque.pollFirst();
            }
            
            // Calculate the equation for the current point and the best candidate in the deque
            if (!deque.isEmpty()) {
                max = Math.max(max, points[i][1] + points[deque.peekFirst()][1] + points[i][0] - points[deque.peekFirst()][0]);
            }
            
            // Remove elements from the back if they are not useful (yi - xi <= current yi - xi)
            while (!deque.isEmpty() && points[deque.peekLast()][1] - points[deque.peekLast()][0] <= points[i][1] - points[i][0]) {
                deque.pollLast();
            }
            
            // Add current point to the deque
            deque.offerLast(i);
        }
        
        return max;
    }
}

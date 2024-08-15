class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int n = nums.length;

        
        List<int[]> arrPos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrPos.add(new int[] { nums[i], i });
        }

        arrPos.sort(Comparator.comparingInt(a -> a[0]));

       
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            
            if (visited[i] || arrPos.get(i)[1] == i)
                continue;

            
            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;

                // Move to the next index in the cycle
                j = arrPos.get(j)[1];
                cycleSize++;
            }

            // If there is a cycle of size 'k', it takes 'k-1' swaps to sort it
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        // Return the minimum number of swaps required
        return swaps;
    }
}

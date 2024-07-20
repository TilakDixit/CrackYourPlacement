import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // Sort the input array to handle duplicates easily
        Collections.sort(arr);
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[n]; // to track used elements in each permutation
        
        backtrack(result, arr, new ArrayList<>(), used);
        
        return result;
    }
    
    private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> arr, ArrayList<Integer> temp, boolean[] used) {
        if (temp.size() == arr.size()) {
            result.add(new ArrayList<>(temp)); // Add a copy of temp to result to avoid reference issues
            return;
        }
        
        for (int i = 0; i < arr.size(); i++) {
            // Skip if the element is already used or if it's a duplicate and the previous duplicate isn't used
            if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1])) {
                continue;
            }
            
            temp.add(arr.get(i));
            used[i] = true;
            
            backtrack(result, arr, temp, used);
            
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}

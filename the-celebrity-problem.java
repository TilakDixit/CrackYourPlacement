class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
           Stack<Integer> stack = new Stack<>();
        
        // Step 1: Push all people onto the stack
        for (int i = 0; i < mat.length; i++) {
            stack.push(i);
        }
        
        // Step 2: Find the potential celebrity
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            
            if (mat[a][b] == 1) {
                // a knows b, so a is not a celebrity
                stack.push(b);
            } else {
                // a does not know b, so b is not a celebrity
                stack.push(a);
            }
        }
        
        // Step 3: Verify the potential celebrity
        if (stack.isEmpty()) {
            return -1;
        }
        
        int celb = stack.pop();
        for (int i = 0; i < mat.length; i++) {
            if (i != celb && (mat[celb][i] == 1 || mat[i][celb] == 0)) {
                return -1;
            }
        }
        
        return celb;
    }
}

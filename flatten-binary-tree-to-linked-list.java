class Solution {
    public void flatten(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                // Find the rightmost node in the left subtree
                TreeNode rightmost = current.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }
                // Rewire the connections
                rightmost.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            // Move on to the right side of the tree
            current = current.right;
        }
    }
}

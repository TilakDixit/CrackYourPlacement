/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
    public static void tree(TreeNode node, int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
      
        int mid = start + (end - start) / 2;
        
        node.val = nums[mid];
        
        if (start <= mid - 1) {
            node.left = new TreeNode();
            tree(node.left, nums, start, mid - 1);
        }
        
        if (mid + 1 <= end) {
            node.right = new TreeNode();
            tree(node.right, nums, mid + 1, end);
        }
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode();
        int end = nums.length - 1;
        tree(root, nums, 0, end);

        return root;
    }
    
    
    
}

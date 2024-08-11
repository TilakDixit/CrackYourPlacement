class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return (Math.max(height(root.left),height(root.right))+1);
        
    }
    int height(TreeNode node){
         if(node==null){
            return 0;
        }
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
     
        return Math.max(leftHeight,rightHeight)+1;
    }
}

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int result=0;
        if(root.val<=high&&root.val>=low){
            result=root.val;

        }
        int left=rangeSumBST( root.left,low, high);
         int right=rangeSumBST( root.right,low, high);

        return left+right+result;
    }
}

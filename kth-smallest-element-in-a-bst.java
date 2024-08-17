class Solution {
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
       TreeNode l= help(root ,  k);
      return l.val;

    }
    public TreeNode help(TreeNode root,int k){
        if(root==null){
            return null;
        }
        TreeNode left=help(root.left,  k) ;
        if(left!=null){
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return help(root.right,  k);

    }
}

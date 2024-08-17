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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>result =new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return result;
        }    
        queue.offer(root);
        while(!queue.isEmpty()){
            int listend=queue.size();
            for(int i=0;i<listend;i++){
                TreeNode current =queue.poll();
                if(i==listend-1){
                    result.add(current.val);
                }
                if(current.left!=null){
                     queue.offer(current.left);
                    
                }
                 if(current.right!=null){
                     queue.offer(current.right);
                    
                }
            }
        }
        return result;

    
   } 
        
    
}

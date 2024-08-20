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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
    List<List<Integer>> result =new ArrayList<>();
    if(root==null){
        return result;
    }

    Deque<TreeNode> deque= new LinkedList<>();
    deque.offer(root);
    boolean reveser=false;
    while(!deque.isEmpty()){
        int levelsize= deque.size();
        List<Integer> currlist =new ArrayList<>(levelsize);
        
        for(int i=0;i<levelsize;i++){
            if(!reveser){
                 TreeNode current =deque.pollFirst();
            currlist.add(current.val);
            if(current.left!=null){
                deque.addLast(current.left);

            }
            if(current.right!=null){
                deque.addLast(current.right);

            }

            }else{
                 TreeNode current =deque.pollLast();
            currlist.add(current.val);
             if(current.right!=null){
                deque.addFirst(current.right);

            }
            if(current.left!=null){
                deque.addFirst(current.left);

            }
         
           

            }
           
        }
        result.add(currlist);
        reveser=!reveser ;
    }
    return result;
   
        
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
         List <String> list=new ArrayList<>();
        helper(root,list);
         StringBuilder stringBuilder = new StringBuilder();

        for (String s : list) {
            stringBuilder.append(s).append(", ");
        }

        // Remove the last ", "
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }

        String result = stringBuilder.toString();
        return result;
        
    }
     void helper(TreeNode node,List<String> list){
        if(node==null){
            list.add("null");
            return;
        }list.add(String.valueOf(node.val));
        helper(node.left, list);
        helper(node.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] array = data.split(", ");
        List<String> list = new ArrayList<>(Arrays.asList(array));
         Collections.reverse(list);
        TreeNode node=helper2(list);
        return node;
        
    }
     TreeNode helper2(List<String> list){
        String val=list.remove(list.size()-1);
        if(val.charAt(0)=='n'){
            return null;
        }
        TreeNode node= new TreeNode(Integer.parseInt(val));
        node.left=helper2(list);
        node.right=helper2(list);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));

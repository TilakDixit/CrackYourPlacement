class Solution
{
    public static boolean isDeadEnd(Node root)
    
    {
      return isDeadEnd(root, 1, Integer.MAX_VALUE);
    }
    private static boolean isDeadEnd(Node root, int min, int max) {
        if (root == null)
            return false;

        // A dead-end is found if min equals max
        if (min == max)
            return true;

        // Recur for left and right subtrees with updated ranges
        return isDeadEnd(root.left, min, root.data - 1) || isDeadEnd(root.right, root.data + 1, max);
    }
}

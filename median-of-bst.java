class Tree
{
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> arr=new ArrayList<>();
        helper(arr,root);
       
        if(arr.size()%2==0){
            int m=arr.size()/2 -1;
           return (arr.get(m)+arr.get(m+1))/2.0f;
           
        }else{
             int m=arr.size()/2;
           return arr.get(m);
            
            
        }
    }
   static void  helper( ArrayList<Integer> arr, Node root){
        if(root==null){
            return;
        }
        helper(arr,root.left);
        arr.add(root.data);
        helper(arr,root.right);
    }
}

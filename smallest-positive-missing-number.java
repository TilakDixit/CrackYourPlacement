 class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int res=1;
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
           
              if(arr[i]==res){
                  
                  
             
                  res++;
              }
            
            
        }
        return res;
    }
}

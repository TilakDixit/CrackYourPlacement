class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right=nums.length-1;
        while(left<right){
            int mid =(left+right)/2;
        if(nums[mid]>nums[right]){
            left++;
        }else{
            right =mid;
        }
        }
        int p =left;
        left =0;
        right =nums.length-1;
          if(nums[right]<target){
                right=p;
            }else{
                left=p;
            }
         while (left <= right) {
           
          
             int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid; // Found the target element, return its index
            } else if (nums[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }

          
        }
        return -1;
        
    }
}

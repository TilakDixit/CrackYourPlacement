class Solution {
    public int findDuplicate(int[] nums) {
       int []result=new int[nums.length+1];
       for(int i=0;i<nums.length;i++){
        result[nums[i]]++;
       }
       for(int i=0;i<nums.length;i++){
        if(result[i]>1){
            return i;
        }
       }


        return -1;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> l=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(l.containsKey(compliment)){
                return new int[]{i,l.get(compliment)};

            }
            l.put(nums[i],i);


        }


        
        return new int[] {};
    }
}

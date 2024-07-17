class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
       List<List<Integer>> result = new ArrayList<>();

       for(int i=0;i<n;i++){
        int a=nums[i];
        int t=-a;
        int s=i+1;
        int e=n-1;
        while(s<e){
            if(nums[s]+nums[e]==t){
                result.add(Arrays.asList(nums[i],nums[s],nums[e]));
               
                 while(s<e&&nums[s]==nums[s+1]){
                s++;
            }
             while(s<e&&nums[e]==nums[e-1]){
                e--;
            }
             s++;
                e--;
            }else if(nums[s]+nums[e]>t){
                e--;
            }else{
                s++;
            }
           
        }
        while(i+1<n&&nums[i]==nums[i+1]){
            i++;
        }

       }
       return result;
        
    }
}

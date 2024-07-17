class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer>num=new ArrayList<>();
       Set<Integer> seen=new HashSet<>();
       for(int a:arr){
        if(seen.contains(a)){
            num.add(a);

        }else{
            seen.add(a);
        }
       }
        return num;
       }}

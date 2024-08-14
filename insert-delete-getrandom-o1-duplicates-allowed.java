 import java.util.*;
 class RandomizedCollection {
    private List<Integer> nums;
    private Map<Integer, Set<Integer>> map;
    private Random rand;

    public RandomizedCollection() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
      
        
    }
    
    public boolean insert(int val) {
        
        boolean notPresent = !map.containsKey(val);
         if (!map.containsKey(val)) {
            map.put(val,new HashSet<Integer>());
           
        }
       map.get(val).add(nums.size());
       nums.add(val);
       return notPresent;
    }
        
    
    
    public boolean remove(int val) {
        if (!map.containsKey(val) || map.get(val).isEmpty()) {
            return false;
        }
        int loc = map.get(val).iterator().next();
        map.get(val).remove(loc);
        if (loc < nums.size() - 1) {
            int lastVal = nums.get(nums.size() - 1);
            nums.set(loc, lastVal);
            map.get(lastVal).remove(nums.size() - 1);
            map.get(lastVal).add(loc);
        }
        nums.remove(nums.size() - 1);
        if (map.get(val).isEmpty()) {
            map.remove(val);
        }
        return true;
        
    }
    
    public int getRandom() {
       return nums.get(rand.nextInt(nums.size()));
        
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        
         Map<String, List<String>> map = new HashMap<>();
        
        for (String s : string_list) {
            char[] curr = s.toCharArray();
            Arrays.sort(curr);
            String str = new String(curr);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}

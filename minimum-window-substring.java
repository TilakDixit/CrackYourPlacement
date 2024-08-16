class Solution {
    public String minWindow(String s, String t) {
          if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        String ans="";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

      int matchcount=0;
      int tal=t.length();
        Map<Character, Integer> map1 = new HashMap<>();
      int i=-1; int j=-1;
      while(true){
        boolean f1=false;
        boolean f2=false;

        // accuqire
        while(i<s.length()-1&&matchcount<tal){
            i++;
            char ch=s.charAt(i);
             map1.put(ch, map1.getOrDefault(ch, 0) + 1);
             if(map1.getOrDefault(ch, 0)<=map.getOrDefault(ch, 0)){
                matchcount++;
             }
             f1=true;

        }
        // relase collect
        while(j<i&&matchcount==tal){
            String pans=s.substring(j+1,i+1);
            if(ans.length()==0||ans.length()>pans.length()){
                ans=pans;
            }
            j++;
             char ch=s.charAt(j);
             if(map1.get(ch)==1){
                map1.remove(ch);
             }else{
                map1.put(ch,map1.get(ch)-1);
             }
             if(map1.getOrDefault(ch, 0)<map.getOrDefault(ch, 0)){
                matchcount--;
             }
              f2=true;

        }
        if(f1==false&&f2==false){
            break;
        }
      }

      return ans;

        
    }
}

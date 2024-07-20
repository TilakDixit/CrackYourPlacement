class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String g =strs[0];
        if(g.length()==0){
            return "";
        }
       
       for(int i=1;i<n;i++){
           while(strs[i].indexOf(g)!=0){
               g =g.substring(0,g.length()-1);
               if(g.length()==0){
                   return "";
               }
           }
       }
         return g;
        
    }
}

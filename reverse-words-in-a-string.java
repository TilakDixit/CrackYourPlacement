class Solution {
    public String reverseWords(String s) {
        String ans="";
        String [] l=s.split(" ",0);
        for(int i=l.length-1;i>=0;i--){
             if (!l[i].isEmpty()) {
                 if (!ans.isEmpty()) { // Add space if ans is not empty (to avoid leading space)
                    ans += " ";
                }
            
            ans+=l[i];
            
        }}
        return ans.length()==0?"":ans;
        
    }
}

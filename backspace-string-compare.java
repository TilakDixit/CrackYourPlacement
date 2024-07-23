class Solution {
     private Stack<Character> first = new Stack<>();
        private Stack<Character> second = new Stack<>();
    public boolean backspaceCompare(String s, String t) {
        
        for(int i=0;i<s.length();i++){
            
            
            if(s.charAt(i)=='#'){
                if(!first.isEmpty()){
                     first.pop();

                }
                
            }else{ first.push(s.charAt(i));}
        }
          for(int i=0;i<t.length();i++){
            
             if((t.charAt(i)=='#')){
                
                 if(!second.isEmpty()){
                     second.pop();

                }
                
            }else{ second.push(t.charAt(i));}
           
        }
        if(first.equals(second)){
            return true;
        }
        return false;
        
    }
}

class Solution {
    public String simplifyPath(String path) {
         String[] arrOfStr = path.split("/");
        Stack<String> stack = new Stack<>();
       
        
        for (String str : arrOfStr) {
            if (str.equals("") || str.equals(".")) {
               
                continue;
            } else if (str.equals("..")) {
                
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                
                stack.push(str);
            }
        }
        StringBuilder fi = new StringBuilder();
        while (!stack.isEmpty()) {
            fi.insert(0, "/" + stack.pop());
        }
        return fi.length() > 0 ? fi.toString() : "/";
        
    }
}

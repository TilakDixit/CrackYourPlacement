class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer result=new StringBuffer();
     
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            result.append((char)(65+rem));
              columnNumber= columnNumber/26;

        }
        return result.reverse().toString();
    }
}

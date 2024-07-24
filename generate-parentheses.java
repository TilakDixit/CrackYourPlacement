class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result= new ArrayList<>();
        int open=0;
        int close=0;
        back(result,"", n,open,close);
        return result;

        
    }
    private void back(List<String> result,String l,int n,int o,int c){
        if (l.length() == n * 2) {
            result.add(l);
            return;
        }
        if (o < n) {
            back(result, l+ "(", n, o + 1, c);
        }
        if (c < o) {
            back(result, l+ ")", n, o, c + 1);
        }

    }
}

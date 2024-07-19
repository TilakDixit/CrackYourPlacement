class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rf=0;
        int re=matrix.length-1;
        int cf=0;
        int ce=matrix[0].length-1;
        int n=matrix.length*matrix[0].length;
        List<Integer>list=new ArrayList<>();
        while(n>0){
            for(int i=cf;n>0&&i<=ce;i++){
                list.add(matrix[rf][i]);
                n--;
            }
            rf++;
             for(int j=rf;n>0&&j<=re;j++){
                list.add(matrix[j][ce]);
                n--;
            }
            ce--;
             for(int k=ce;n>0&&k>=cf;k--){
                list.add(matrix[re][k]);
                n--;
            }
            re--;
             for(int t=re;n>0&&t>=rf;t--){
                list.add(matrix[t][cf]);
                n--;
            }
            cf++;
        }
        return list;

    }
}

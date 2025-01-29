class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++){
            int minval = matrix[i][0];
            int minval_index = 0;
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] < minval){
                    minval = matrix[i][j];
                    minval_index = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++){
                if (matrix[k][minval_index] > minval){
                    isLucky = false;
                    break;
                }
            }
            if (isLucky){
                res.add(minval);
            }
        }
        return res;
    }
}
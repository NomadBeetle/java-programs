class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] nums = new int[m][n];
        int oddnos = 0;
        for (int i = 0; i < indices.length; i++){
            for (int j = 0; j < indices[i].length; j++){
                if (j == 0){
                    for (int k = 0; k < n; k++)
                    nums[indices[i][j]][k] += 1;
                } else if (j == 1){
                    for (int k = 0; k < m; k++){
                        nums[k][indices[i][j]] += 1;
                    }
                }
            }
        }  

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (nums[i][j] % 2 != 0){
                    oddnos++;
                }
            }
        }

        return oddnos;     
    }
}
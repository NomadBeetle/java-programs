class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        //primary diagonal
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (i == j){
                    sum += mat[i][j];
                }
            }
        }

        //secondary diagonal
        for (int i = 0; i < mat.length; i++){
            for (int j = mat.length - 1 - i; j >= 0; j--){
                if (mat.length % 2 != 0){
                    if ((i + j) % 2 == 0){
                        if (i == j){
                            break;
                        }
                        sum += mat[i][j];
                        break;
                    }
                } else {
                    if ((i + j) % 2 != 0){
                        sum += mat[i][j];
                        break;
                    }
                }
            }
        }

        return sum;        
    }
}
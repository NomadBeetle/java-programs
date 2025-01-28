class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean res = false;
        int rot_count = 0; //initializing rotation count
        while (rot_count < 4){
            int[][] transpose = new int[mat.length][target.length];

            //check whether current matrix is equal to the target
            if (Arrays.deepEquals(target, mat)){
                res = true;
                break;
            } else {

                //transpose matrix
                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[0].length; j++){
                        transpose[j][i] = mat[i][j];
                    }
                }
            }

            //reverse each row of transpose matrix
            for (int i = 0; i < mat.length; i++){
                int start = 0;
                int end = mat.length - 1;
                while (start < end){
                    int temp = transpose[i][start];
                    transpose[i][start] = transpose[i][end];
                    transpose[i][end] = temp;
                    start++;
                    end--;
                }
            }

            //preparation for the next rotation
            rot_count++;
            mat = transpose;
        
        }
        return res;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        // Get the number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Create lists to store the indices of rows and columns to be set to zero
        ArrayList<int[]> r_indices = new ArrayList<>();
        ArrayList<int[]> c_indices = new ArrayList<>();
        
        // Traverse through the matrix to find zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {  // If a zero is found
                    // Add all elements in the same column to the r_indices list
                    for (int k = 0; k < rows; k++) {
                        int[] arr = {k, j};
                        r_indices.add(arr);
                    }

                    // Add all elements in the same row to the c_indices list
                    for (int k = 0; k < cols; k++) {
                        int[] arr = {i, k};
                        c_indices.add(arr);
                    }
                }
            }
        }
        
        // Set all rows to zero based on the indices stored in r_indices
        for (int[] indices : r_indices) {
            matrix[indices[0]][indices[1]] = 0;
        }
        
        // Set all columns to zero based on the indices stored in c_indices
        for (int[] indices : c_indices) {
            matrix[indices[0]][indices[1]] = 0;
        }
    }
}

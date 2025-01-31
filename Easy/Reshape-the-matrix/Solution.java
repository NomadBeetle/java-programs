import java.util.ArrayList;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // Check if reshape is possible, if not return the original matrix
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }

        // List to temporarily store matrix elements
        ArrayList<Integer> nums = new ArrayList<>();

        // Flatten the original matrix into the list
        for (int[] row : mat) {
            for (int num : row) {
                nums.add(num);
            }
        }

        int[][] reshape = new int[r][c]; // Reshaped matrix
        int index = 0; // To track position in the list

        // Fill the reshaped matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshape[i][j] = nums.get(index++);
            }
        }

        return reshape;
    }
}

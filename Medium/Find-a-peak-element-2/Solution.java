class Solution {

    // Returns the row index of the maximum element in a given column
    private int maxRowInColumn(int[][] mat, int col) {
        int maxRow = 0;
        for (int r = 1; r < mat.length; r++) {
            if (mat[r][col] > mat[maxRow][col]) {
                maxRow = r;
            }
        }
        return maxRow;
    }

    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int lo = 0, hi = cols - 1;

        while (lo <= hi) {
            int midCol = lo + (hi - lo) / 2;

            // 1. Find the highest element in the current middle column
            int peakRow = maxRowInColumn(mat, midCol);
            int curr = mat[peakRow][midCol];

            // 2. Get left and right neighbours
            int left  = (midCol == 0)        ? -1 : mat[peakRow][midCol - 1];
            int right = (midCol == cols - 1) ? -1 : mat[peakRow][midCol + 1];

            // 3. Check if current is a 2‑D peak
            if (curr >= left && curr >= right) {
                return new int[]{peakRow, midCol};
            }

            // 4. Move to the side with the larger neighbour
            if (left > curr) {
                hi = midCol - 1;         // peak lies to the left
            } else {
                lo = midCol + 1;         // peak lies to the right
            }
        }
        return new int[]{-1, -1};
    }
}

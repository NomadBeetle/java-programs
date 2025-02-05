class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res = new int[rows * cols][2]; // Result array to store coordinates
        int left = cStart, right = cStart + 1, top = rStart, bottom = rStart + 1;
        int index = 0;

        // Expanding boundaries in a spiral pattern
        while (left >= 0 || right < cols || top >= 0 || bottom < rows) {
            // Traverse right
            if (top >= 0) {
                for (int i = Math.max(0, left); i <= Math.min(cols - 1, right - 1); i++) {
                    res[index++] = new int[] {top, i};
                }
            }
            left--;

            // Traverse downward
            if (right < cols) {
                for (int i = Math.max(0, top); i <= Math.min(rows - 1, bottom - 1); i++) {
                    res[index++] = new int[] {i, right};
                }
            }
            top--;

            // Traverse left
            if (bottom < rows) {
                for (int i = Math.min(cols - 1, right); i >= Math.max(0, left + 1); i--) {
                    res[index++] = new int[] {bottom, i};
                }
            }
            right++;

            // Traverse upward
            if (left >= 0) {
                for (int i = Math.min(rows - 1, bottom); i >= Math.max(0, top + 1); i--) {
                    res[index++] = new int[] {i, left};
                }
            }
            bottom++;
        }
        return res; // Return the result matrix with spiral order coordinates
    }
}

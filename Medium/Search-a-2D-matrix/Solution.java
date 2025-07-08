public class Solution {

    private boolean binarySearch(int[] row, int target) {
        int start = 0, end = row.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (row[mid] == target) return true;
            else if (row[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0, bottom = rows - 1;

        //Narrow down the row
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else if (target > matrix[mid][cols - 1]) {
                top = mid + 1;
            } else {
                //Binary search on the found row
                return binarySearch(matrix[mid], target);
            }
        }

        return false;
    }
}

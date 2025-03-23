class Solution {
    public int countNegatives(int[][] grid) {
        int rows = 0, cols = grid[0].length - 1;
        int count = 0;
        while (rows < grid.length && cols >=0){
            if (grid[rows][cols] < 0){
                cols--;
                count += grid.length - rows;
            } else {
                rows++;
            }
        }
        return count;
    }
}
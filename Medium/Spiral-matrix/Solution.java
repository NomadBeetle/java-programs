class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0) return res; // If the matrix is empty.

        int BRS = 0; //Start of the row
        int BRE = matrix.length; // Ending Row
        int BCS = 0; //Start of the column
        int BCE = matrix[0].length; // Ending Column

        while (BRS < BRE && BCS < BCE) {
            // Traverse from left to right
            for (int j = BCS; j < BCE; j++) {
                res.add(matrix[BRS][j]);
            }
            BRS++;

            // Traverse from top to bottom
            for (int j = BRS; j < BRE; j++) {
                res.add(matrix[j][BCE - 1]);
            }
            BCE--;

            // Traverse from right to left, if there are remaining rows
            if (BRS < BRE) {
                for (int j = BCE - 1; j >= BCS; j--) {
                    res.add(matrix[BRE - 1][j]);
                }
                BRE--;
            }

            // Traverse from bottom to top, if there are remaining columns
            if (BCS < BCE) {
                for (int j = BRE - 1; j >= BRS; j--) {
                    res.add(matrix[j][BCS]);
                }
                BCS++;
            }
        }

        return res;

    }
}
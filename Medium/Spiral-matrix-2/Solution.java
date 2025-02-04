class Solution {
    public int[][] generateMatrix(int n) {
        int[][] Matrix = new int[n][n]; // Initialize matrix
        int BRS = 0; // Row Start
        int BRE = n; // Row End
        int BCS = 0; // Column Start
        int BCE = n; // Column End
        int num = 1; // Counter for filling values

        while (BRS <= BRE && BCS <= BCE && num <= (n * n)) {
            
            // Traverse from left to right along the top row
            for (int j = BCS; j < BCE; j++) {
                Matrix[BRS][j] = num++;
            }
            BRS++;

            // Traverse from top to bottom along the rightmost column
            for (int j = BRS; j < BRE; j++) {
                Matrix[j][BCE - 1] = num++;
            }
            BCE--;

            // Traverse from right to left along the bottom row if rows remain
            if (BRS < BRE) {
                for (int j = BCE - 1; j >= BCS; j--) {
                    Matrix[BRE - 1][j] = num++;
                }
                BRE--;
            }

            // Traverse from bottom to top along the leftmost column if columns remain
            if (BCS < BCE) {
                for (int j = BRE - 1; j >= BRS; j--) {
                    Matrix[j][BCS] = num++;
                }
                BCS++;
            }            
        }

        return Matrix;  
    }
}

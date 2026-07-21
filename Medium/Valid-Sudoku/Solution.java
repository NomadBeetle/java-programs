import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];

                // Skip empty cells
                if (val == '.') {
                    continue;
                }

                String row = val + " in row " + r;
                String col = val + " in col " + c;
                String box = val + " in box " + (r / 3) + "-" + (c / 3);

                if (!seen.add(row) || !seen.add(col) || !seen.add(box)) {
                    return false;
                }
            }
        }

        return true;
    }
}

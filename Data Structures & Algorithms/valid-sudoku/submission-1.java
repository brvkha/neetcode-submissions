class Solution {
    //Cách 2: One-Pass với HashSet String
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                
                if (val != '.') {
                    String rowStr = val + "r" + r; 
                    String colStr = val + "c" + c;
                    String boxStr = val + "b" + (r / 3) + "-" + (c / 3);

                    if (!seen.add(rowStr) || 
                        !seen.add(colStr) || 
                        !seen.add(boxStr)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                
                // Ép kiểu ký tự sang index số nguyên từ 0-8
                int val = board[r][c] - '1'; 
                
                // Tính index của sub-box (từ 0-8)
                int boxIndex = (r / 3) * 3 + (c / 3);
                
                // Nếu số này đã được bật true ở 1 trong 3 mảng -> Trùng lặp
                if (rows[r][val] || cols[c][val] || boxes[boxIndex][val]) {
                    return false;
                }
                
                // Đánh dấu là đã gặp
                rows[r][val] = true;
                cols[c][val] = true;
                boxes[boxIndex][val] = true;
            }
        }
        return true;
    }
}
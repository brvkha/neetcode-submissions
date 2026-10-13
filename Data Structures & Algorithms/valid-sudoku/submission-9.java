class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Chỉ dùng 3 mảng 1 chiều. Dung lượng: 3 * 9 * 4 bytes = 108 bytes
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }

                int shift = board[r][c] - '1';
                // Tạo mask để thao tác
                int mask = 1 << shift;
                
                // Tính index của box 
                int boxIndex = (r / 3) * 3 + (c / 3);

                // Dùng phép AND (&) để kiểm tra xem bit đó đã được bật (bằng 1) chưa
                if ((rows[r] & mask) != 0 || 
                    (cols[c] & mask) != 0 || 
                    (boxes[boxIndex] & mask) != 0) {
                    return false; // Trùng lặp!
                }

                // Dùng phép OR (|) để bật bit (lưu trạng thái)
                rows[r] |= mask;
                cols[c] |= mask;
                boxes[boxIndex] |= mask;
            }
        }
        return true;
    }
}
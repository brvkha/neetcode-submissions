class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++){
            Set<Character> seen = new HashSet<>();
            for (int j=0; j <9; j++){
                if (board[i][j] != '.'){
                    if (seen.contains(board[i][j])){
                        return false;
                    } else {
                        seen.add(board[i][j]);
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++){
            Set<Character> seen = new HashSet<>();
            for (int j=0; j <9; j++){
                if (board[j][i] != '.'){
                    if (seen.contains(board[j][i])){
                        return false;
                    } else {
                        seen.add(board[j][i]);
                    }
                }
            }
        }
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                Set<Character> seen = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[boxRow+i][boxCol+j] != '.'){
                            if (seen.contains(board[boxRow+i][boxCol+j])){
                                return false;
                            } else {
                                seen.add(board[boxRow+i][boxCol+j]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}

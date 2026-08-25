class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check in rows
        for (int i = 0; i < 9; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];

                if (value == '.')
                    continue;

                if (!seen.add(value)) {
                    return false;
                }
            }
        }

        // check in columns
        for (int i = 0; i < 9; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char value = board[j][i];

                if (value == '.')
                    continue;

                if (!seen.add(value)) {
                    return false;
                }
            }
        }

        // check in each boxes

        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                HashSet<Character> seen = new HashSet<>();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        char v = board[k][l];
                        if (v == '.')
                            continue;
                        if (!seen.add(v))
                            return false;
                    }
                }
            }
        }

        return true;
    }
}

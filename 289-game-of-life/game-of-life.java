class Solution {
    public void gameOfLife(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int count = 0;

                // top
                if (i > 0 && (matrix[i - 1][j] == 1 || matrix[i - 1][j] == 2))
                    count++;

                // bottom
                if (i + 1 < row && (matrix[i + 1][j] == 1 || matrix[i + 1][j] == 2))
                    count++;

                // left
                if (j > 0 && (matrix[i][j - 1] == 1 || matrix[i][j - 1] == 2))
                    count++;

                // right
                if (j + 1 < col && (matrix[i][j + 1] == 1 || matrix[i][j + 1] == 2))
                    count++;

                // right top diagonal
                if (i - 1 >= 0 && j + 1 < col &&
                        (matrix[i - 1][j + 1] == 1 || matrix[i - 1][j + 1] == 2))
                    count++;

                // left top diagonal
                if (i - 1 >= 0 && j - 1 >= 0 &&
                        (matrix[i - 1][j - 1] == 1 || matrix[i - 1][j - 1] == 2))
                    count++;

                // left bottom diagonal
                if (i + 1 < row && j - 1 >= 0 &&
                        (matrix[i + 1][j - 1] == 1 || matrix[i + 1][j - 1] == 2))
                    count++;

                // right bottom diagonal
                if (i + 1 < row && j + 1 < col &&
                        (matrix[i + 1][j + 1] == 1 || matrix[i + 1][j + 1] == 2))
                    count++;

                // apply rules
                if (matrix[i][j] == 1 && (count < 2 || count > 3)) {
                    matrix[i][j] = 2; // live → dead
                } else if (matrix[i][j] == 0 && count == 3) {
                    matrix[i][j] = 3; // dead → live
                }
            }
        }

        // final cleanup
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 2) matrix[i][j] = 0;
                if (matrix[i][j] == 3) matrix[i][j] = 1;
            }
        }
    }
}

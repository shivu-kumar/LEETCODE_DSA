class NumMatrix {
    private int prefixsum[][];

    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        prefixsum=new int[r+1][c+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                int top = i>0?prefixsum[i-1][j]:0;
                int left = j>0?prefixsum[i][j-1]:0;
                int topleft = i>0 && j>0 ? prefixsum[i-1][j-1]:0;
                prefixsum[i][j]=matrix[i-1][j-1]+top+left-topleft;
            }
        }
    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        r1++;
        c1++;
        r2++;
        c2++;
        return prefixsum[r2][c2]-prefixsum[r1-1][c2]-prefixsum[r2][c1-1]+prefixsum[r1-1][c1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
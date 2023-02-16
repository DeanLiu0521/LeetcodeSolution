class NumMatrix {
    private int[][] presum;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==0||n==0) return;
        presum = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                presum[i][j] = presum[i-1][j]+presum[i][j-1]+matrix[i-1][j-1]-presum[i-1][j-1];
            }
        }
        
    }
    
    public int sumRegion(int x1, int y1, int x2, int y2) {
        return presum[x2+1][y2+1] - presum[x1][y2+1] - presum[x2+1][y1] +
presum[x1][y1];

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
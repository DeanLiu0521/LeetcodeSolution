class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                int tmp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        
        for(int[] row:matrix){
            reverse(row);
        }
    }
    
    public void reverse(int[] row){
        int i=0, j= row.length-1;
        while(i<j){
            int tmp = row[i];
            row[i]=row[j];
            row[j]=tmp;
            i++;
            j--;
        }
    }
}
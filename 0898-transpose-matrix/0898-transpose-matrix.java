class Solution {
    public int[][] transpose(int[][] matrix) {
        int c = matrix[0].length;
        int r = matrix.length;
        if(matrix.length==0) 
        return matrix;
        int[][] arr = new int[c][r];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}
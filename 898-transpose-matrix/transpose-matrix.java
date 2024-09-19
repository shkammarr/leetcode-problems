class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length; int m = matrix[0].length;
        int result[][] = new int[m][n];

        for(int i= 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        System.gc();
        return result;   
    }
}
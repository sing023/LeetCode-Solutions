class Solution {
    public void rotate(int[][] matrix) {
        //transpose the matrix by changing rows to columns
        for (int i=0; i<matrix.length; i++) {
            for (int j=i+1; j<matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse for each row
        for (int i =0; i<matrix.length; i++) {
            for (int left=0, right=matrix.length-1; left<right; left++ , right--) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
        }
        //Arrays.stream(matrix).forEach( (row) -> System.out.println(Arrays.toString(row)));

    }
}
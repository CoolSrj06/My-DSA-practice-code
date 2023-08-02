public class Transpose_Matrix {
    public int[][] transpose(int[][] matrix) {
        int[][] arr =new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}
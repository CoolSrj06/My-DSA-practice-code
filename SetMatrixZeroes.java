import java.util.ArrayList;

public class SetMatrixZeroes {
    public static void main(String[] args) {
    int[][] matrix={{0,1,1,0},{1,2,3,1},{1,1,1,5}};
    setZeroes(matrix);
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> zeros= new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0) {
                    ArrayList<Integer> zero = new ArrayList<>();
                    zero.add(i);
                    zero.add(j);
                    zeros.add(zero);
                }
            }
        }
        for (ArrayList<Integer> zero : zeros) {
            int row = zero.get(0);
            int col = zero.get(1);
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][col] = 0;
            }
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[row][k] = 0;
            }
        }
    }
}

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
        public static int diagonalSum(int[][] mat) {
            int row=0,col=0,sum=0;
            while (row==col) {
                sum += mat[row][col];
                row++;
                col++;
                if (row==mat.length)
                    break;
            }
            col --;
            row=0;
            while (col>=0){
                if (row!=col)
                    sum +=mat[row][col];
                row++;
                col--;
            }
            return sum;
        }
}

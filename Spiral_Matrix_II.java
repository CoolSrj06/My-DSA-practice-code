import java.util.Arrays;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int n=3;
        int[][] ans=generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int minRow=0;
        int maxRow=n-1;
        int minCol=0;
        int maxCol=n-1;int run=1;
        int[][] ans=new int[n][n];
        while (minCol<=maxCol&&minRow<=maxRow&&run<=n*n){
            for (int i = minCol; i <= maxCol; i++) {
                ans[minRow][i]=run++;
            }
            for (int i = ++minRow; i <= maxRow; i++) {
                ans[i][maxCol]=run++;
            }
            for (int i = --maxCol; i >= minCol; i--) {
                ans[maxRow][i]=run++;
            }
            for (int i = --maxRow; i >= minRow; i--) {
                ans[i][minCol]=run++;
            }minCol++;
        }
        return ans;
    }
}

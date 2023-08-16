import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int minRow=0,maxRow=matrix.length-1;
        int minCol=0,maxCol=matrix[0].length-1;
        while (minRow<=maxRow&&minCol<=maxCol){
            for (int i = minCol; i <= maxCol; i++) {
                ans.add(matrix[minRow][i]);
            }++minRow;
            for (int i = minRow; i <=maxRow; i++) {
                ans.add(matrix[i][maxCol]);
            }--maxCol;
            for (int i = maxCol; i >=minCol ; i--) {
                ans.add(matrix[maxRow][i]);
            }--maxRow;
            for (int i = maxRow; i >=minRow ; i--) {
                ans.add(matrix[i][minCol]);
            }++minCol;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}

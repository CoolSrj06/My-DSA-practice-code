import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));

    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        for (int[] value : matrix) { //iterating row-wise
            int min = Integer.MAX_VALUE, imax = 0;
            for (int j = 0; j < matrix[0].length; j++) {//now smallest searching element in row
                if (min > value[j]) {//if the number is the smallest number in the column
                    min = value[j];
                    imax = j;
                }
            }
            int c = 0;
            for (int[] ints : matrix) {//iterating in specific row
                if (ints[imax] > min)//if the min number is max in its row
                    break;
                else
                    c += 1;
            }
            if (c == matrix.length) {//just to make sure if the number was largest in row or not.
                List<Integer> ans = new ArrayList<>();
                ans.add(min);
                return ans;
            }
        }
        return new ArrayList<>();
    }
}

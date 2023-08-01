import java.util.Arrays;

public class Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(2,3,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[0].length;j++) {
                if (j==0)
                    incrementRow(arr,indices[i][j]);
                else
                    incrementCol(arr,indices[i][j]);
            }
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        return odd(arr);
    }
    public static void incrementRow(int[][] arr,int row){
        for (int i = 0; i < arr[0].length; i++) {
            arr[row][i]+=1;
        }
    }
    public static void incrementCol(int[][] arr,int col){
        for (int i = 0; i < arr.length; i++) {
            arr[i][col]+=1;
        }
    }
    public static int odd(int[][] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int j=0;
            while (j<arr[0].length){
                if (arr[i][j]%2!=0)
                    count+=1;
                j++;
            }
        }
        return count;
    }
    }

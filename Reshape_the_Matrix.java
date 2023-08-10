import java.util.Arrays;

public class Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if ((row==r&&col==c)||r*c<row*col||r*c>row*col)
            return mat;
        else {
            int[] temp=new int[r*c];
            int[][] ans=new int[r][c];
            int k=0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    temp[k]=mat[i][j];
                    k++;
                }
            }
            k=0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ans[i][j]=temp[k];
                    k++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[][] mat={
                {1,2,3,4}};
        int[][] ans=matrixReshape(mat,2,2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}

//Solution with better complexity
/**
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if (row*col != r*c)
            return mat;
        else {
            int x=0,y=0;
            int[][] ans=new int[r][c];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    ans[x][y]=mat[i][j];
                    y++;
                    if(y==c){
                        y=0;
                        x++;
                    }
                }
            }
            return ans;
        }
    }
}
 **/
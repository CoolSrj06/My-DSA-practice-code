import java.util.Arrays;

public class Spiral_Matrix_III {
    static int[][] arr;
    static int idx;
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int r = rStart, c = cStart, len = 1;
        arr = new int[rows * cols][2];
        while (idx < (rows * cols )) {
            for (int k = 0; k < len; k++) add(r, c++, rows, cols);
            for (int k = 0; k < len; k++) add(r++, c, rows, cols);
            len++;
            for (int k = 0; k < len; k++) add(r, c--, rows, cols);
            for (int k = 0; k < len; k++) add(r--, c, rows, cols);
            len++;
        }
        return arr;
    }
    private static void add(int r,int c,int rows,int cols){
        if (r<0||r>= rows||c<0||c>= cols)
            return;
        arr[idx][0]=r;
        arr[idx++][1]=c;
    }

    public static void main(String[] args) {
        int[][] ans=spiralMatrixIII(5,6,1,4);
        for (int i = 0; i < 30; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}

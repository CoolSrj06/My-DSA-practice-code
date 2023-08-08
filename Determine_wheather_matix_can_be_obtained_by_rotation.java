import java.util.Arrays;

public class Determine_wheather_matix_can_be_obtained_by_rotation {
    public static void main(String[] args) {
        int [][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int [][] target={{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
//        for (int i = 0,j=target.length-1; i < mat.length; i++,j--) {
//            if (Arrays.toString(mat[i]).equals(Arrays.toString(target[j])))
//                continue;
//            else
//                return false;
//        }
//        return true;

        int index = mat.length-1 ;
        int[][] ans=new int[mat.length][mat.length];
        int num = 0;
        while (num != 4) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    ans[i][j]=mat[j][index];
                }
                index-=1;
            }
            int c=0;
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans.length; j++) {
                    if (ans[i][j]==target[i][j])
                        c+=1;
                }
            }
            if (c== mat.length* mat.length) {
                num = 5;
                break;
            }
            else
                num++;
            for (int i = 0; i < mat.length; i++) {
                System.arraycopy(ans[i], 0, mat[i], 0, mat.length);
                index -= 1;
            }
        }
        return num == 5;
    }
}

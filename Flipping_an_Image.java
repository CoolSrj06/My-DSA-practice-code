import java.util.Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{0,0,1},{1,1,1}};
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        return filpHorizontal(image);
    }
    public static int[][] filpHorizontal(int[][] image){
        int[][] ans=new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0,k=image[0].length-1; j < image[0].length ; j++,k--) {
                   ans[i][k]=image[i][j];
            }
        }
        return invert(ans);
    }
    public static int[][] invert(int[][] ans){
        for (int i=0;i< ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                if (ans[i][j]==1)
                    ans[i][j]=0;
                else
                    ans[i][j]=1;
            }
        }
        return ans;
    }
}

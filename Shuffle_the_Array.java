import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n,new int[n*2],0,n,0)));
    }
        public static int[] shuffle(int[] nums,int n,int[] ans,int i,int j,int c){
            if(i==n)
                return ans;
            else {
                ans[c]=nums[i];
                ans[c+1]=nums[j];
            }
            return shuffle(nums,n,ans,i+1,j+1,c+2);
        }
}

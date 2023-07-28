import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums={3,1,2,10,1};
        int i=0;
        int[] ans = new int[nums.length];
        System.out.println(Arrays.toString(function(i,nums,ans)));
    }
    public static int[] function(int i,int[] nums,int[] ans) {
        if (i == nums.length) {
            return ans;
        } else {
            ans = loop(i,0,nums,ans);
//            for (int j = 0; j < ans.length; j++) {
//                if (i <= j) {
//                    ans[j] += nums[i];
//                }
            }
            return function(i + 1, nums,ans);
        }
    public static int[] loop(int i,int j,int[] nums,int[] ans){
        if(j == ans.length){
            return ans;
        } else {
            if (i <= j) {
                ans[j] += nums[i];
            }
        }
        return loop(i,j+1,nums,ans);
    }
}


import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        return recusion(nums,0,new int[nums.length]);
    }
    public static int[] recusion(int[] nums,int i,int[] ans){
        if (nums.length==i)
            return ans;
        ans[i]=check(nums,i,0,0);
        return recusion(nums,i+1,ans);
    }
    public static int check(int[] nums, int i, int j, int ans){
        if (i==j)
            return check(nums,i,j+1,ans);
        if (j==nums.length)
            return ans;
        if (nums[i]>nums[j]){
            ans+=1;
        }
        return check(nums,i,j+1,ans);
    }
}

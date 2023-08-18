import java.util.ArrayList;
import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums=new int[]{-1};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i= nums.length-1;
        if (k==nums.length)
            k=0;
        while (k> nums.length){
            k-= nums.length;
        }

        while (k!=0){
            ans.add(0,nums[i]);
            i--;
            k--;
        }
        for (int j = 0; j <= i; j++) {
            ans.add(nums[j]);
        }
        for (int a = 0; a < nums.length; a++) {
            nums[a]= ans.get(a);
        }
    }
}

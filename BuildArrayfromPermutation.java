import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={0,2,1,5,3,4};
        int[] ans=new int[6];
        int c=0;
        while(c!=nums.length){
            ans[c]=nums[nums[c]];
            c++;
        }
        System.out.println(Arrays.toString(ans));
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(nums[0]);int count=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                list.add(nums[i]);
                count+=1;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i]=list.get(i);
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,3}));
    }
}

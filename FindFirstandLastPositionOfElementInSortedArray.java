import java.util.ArrayList;

public class FindFirstandLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        System.out.println(searchRange(nums,8));
    }
    public static ArrayList<Integer> searchRange(int[] nums, int target) {
        ArrayList<Integer> ans=new ArrayList<>();
        int start=0;
        int end=nums.length-1;
        while (start<=end) {
            int mid = start- (start-end)/2;
            if (nums[mid] < target) {
                start=mid+1;
            } else if (target<nums[mid]) {
                end=end-1;
            }else
                ans.add(mid);
        }
        return ans;
    }
}

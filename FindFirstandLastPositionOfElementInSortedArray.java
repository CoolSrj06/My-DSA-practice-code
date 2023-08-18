import java.util.ArrayList;

public class FindFirstandLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        System.out.println(searchRange(nums,8));
    }
    public static ArrayList<Integer> searchRange(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans.add(start);
        ans.add(end);
        return ans;
    }
    public static int search(int[] nums,int target,boolean findStartIndex){
        int start=0;int end=nums.length-1;
        int ans=-1;
        while (start<end){
            int mid=start-(start-end)/2;
            if (nums[mid]<target)
                start+=1;
            else if (nums[mid]>target)
                end-=1;
            else {
                ans = mid;// if you get that target is present on the mid index. Now the task is to search if the same target is element is present before it or after it.
                if (findStartIndex)// if we want to find the starting index of the target the if condition should be true.
                    end=mid-1;
                else// otherwise else will continue and it will start to find the last index of the target element
                    start=mid+1;
            }
        }
        return ans;
    }
}

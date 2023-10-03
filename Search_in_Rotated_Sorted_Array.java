public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,1};
        System.out.println(search(nums,1));
    }
    public static int search(int[] nums, int target) {
        int pivot=pivot(nums);

        if (pivot ==-1)
            return binarySearch(nums,0,nums.length-1,target);
        if (target==nums[pivot])
            return pivot;
        if (target>nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        }
        return binarySearch(nums,pivot+1, nums.length-1, target);
    }
    public static int pivot(int []nums){
        int start=0;
        int end= nums.length-1;

        while (start<=end){
            int mid=start-(start-end)/2;
            if (mid<end && nums[mid]>nums[mid+1])
                return mid;
            else if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            } else if (nums[mid]<=nums[start]) {
                end=mid-1;
            }else
                start=mid+1;
        }
        return -1;
    }
    public static int binarySearch(int[] nums,int start,int end,int target){
        while (start<=end){
            // find the middle element
            int mid=start-(start-end)/2;
            if (nums[mid]>target) {
                end=mid-1;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }
            else
                //ans found
                return mid;
        }
        return -1;
    }
}

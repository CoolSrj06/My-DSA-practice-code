public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3};
        System.out.println(nums[singleNonDuplicate(nums)]);
    }
    public static int singleNonDuplicate(int[] nums) {
        if (nums.length==1)
            return nums[0];
        return binarySearch(nums,0,nums.length-1);
    }
    public static int binarySearch(int[] nums,int start,int end){

        while (start<end) {
            int mid = start - (start - end) / 2;
            if (mid % 2 == 0 && mid!= nums.length-1 && nums[mid] != nums[mid + 1])
                end = mid;
            else if (mid % 2 != 0 && mid!=0 && nums[mid] != nums[mid - 1]) {
                end = mid;
            } else
                start = mid + 1;
        }
            return start;
    }
}

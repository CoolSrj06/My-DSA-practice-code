public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        if (nums.length==1)
            return nums[0];
        return binarySearch(nums,0,nums.length-1);
    }
    public static int binarySearch(int[] nums,int start,int end){

        while (start<=end){
            int mid=start-(start-end)/2;
            if ((mid!=nums.length-1&&nums[mid]==nums[mid+1])||(mid!=0&&nums[mid]==nums[mid-1])) {
                binarySearch(nums, mid+1, end);
                binarySearch(nums, start, mid - 1);
            }
            else return nums[mid];
        }
        return -1;
    }
}

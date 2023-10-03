public class Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(nums,2));
    }
    public static boolean search(int[] nums, int target) {
        if (nums.length==1){
            return nums[0]==target;
        }
        int pivot=pivot(nums,0, nums.length-1);
        int ans;
        if (target>=nums[0])
            ans=binarySearch(nums,0,pivot,target);
        else
            ans=binarySearch(nums,pivot+1,nums.length-1,target);
        return ans!=-1;
    }
    public static int pivot(int[] nums,int start,int end){
        while (start<end && nums[start] == nums[start+1])
            start+=1;
        while (start<end && nums[end] == nums[end-1])
            end-=1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            else if (mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            else if (nums[start]>=nums[mid]) {
                end=mid-1;
            }else
                start=mid=1;
        }
        return -1;
    }
    public static int binarySearch(int[] nums,int start,int end,int target){

        while (start<=end) {
            int mid = start - (start - end) / 2;
            if (nums[mid]==target)
                return mid;
            if (nums[mid]>target) {
                end = mid-1;
            } else
                start = mid + 1;
        }
        return -1;
    }
}

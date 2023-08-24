import java.util.Arrays;

public class Sort_Colors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        function(nums,0,nums.length-1);
    }
    public static void function(int[] nums,int low,int high){
        if(low>=high)
            return;
        int start=low;
        int end=high;
        int mid=start-(start-end)/2;
        int pivot=nums[mid];
        while (start<=end){
            while (nums[start]<pivot)
                start++;
            while (nums[end]>pivot)
                end--;
            if (start<=end){
                int t=nums[start];
                nums[start]=nums[end];
                nums[end]=t;
                start++;
                end--;
            };
        }
        function(nums,low,end);
        function(nums,start,high);
    }
}

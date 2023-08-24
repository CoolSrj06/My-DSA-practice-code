import java.util.Arrays;

public class Sachin_assignment {
        public static void main(String[] args) {
            int[] nums={5,3,2};
            int[] bustTime={9,8,7};
            sortColors(nums,bustTime);
            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(bustTime));
        }
        public static void sortColors(int[] nums, int[] bustTime) {
            function(nums,0,nums.length-1,bustTime);
        }
        public static void function(int[] nums,int low,int high,int[] bustTime){
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
                    t=bustTime[start];
                    bustTime[start]=bustTime[end];
                    bustTime[end]=t;
                    start++;
                    end--;

                };
            }
            function(nums,low,end,bustTime);
            function(nums,start,high,bustTime);
        }
}

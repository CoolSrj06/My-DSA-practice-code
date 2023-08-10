public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0,finalsum=Integer.MIN_VALUE,length=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            length+=1;

            if (sum>finalsum)
                finalsum=sum;

            if (sum < 0){
                sum=0;
                length=0;
            }
        }
        System.out.println("Length of Subarray "+length);
        return finalsum;
    }

    /** Now here in this question you can see that you can also be asked some more things like :

    1. Length of the max subarray
    2. Elements of the max subarray
    3. Start and End index of max subarray
    This is very important concept from interview point so try to get the ans of above mentioned point and have confidence on this algorithm.
    **/

    //1=>

}


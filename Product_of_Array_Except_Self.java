public class Product_of_Array_Except_Self {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int product=1;int pro=1;
        for (int i = 0; i < nums.length; i++) {
            product*=nums[i];
        }
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                for (int j = 0; j < nums.length; j++) {
                    if (i!=j)
                        pro*=nums[j];
                }
                ans[i]=pro;
            }else {
                ans[i]=product/nums[i];
            }
        }
        return ans;
    }

    /**

     Alternate solution

     int[]left = new int[nums.length];
     int[]right = new int[nums.length];
     int[]ans = new int[nums.length];

     left[0] = 1 ;
     for(int i = 1;i<nums.length;i++){
     left[i] = left[i-1]*nums[i-1];
     }

     right[nums.length-1] = 1;
     for(int i = nums.length-2;i>=0;i--){
     right[i] = right[i+1]*nums[i+1];
     }

     for(int i = 0;i<nums.length;i++){
     ans[i] = left[i]*right[i];
     }

     return ans;

     */
}

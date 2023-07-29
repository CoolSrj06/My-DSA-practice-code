public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        return recusion(nums,0,0);
    }
    public static int recusion(int[] nums,int i,int ans){
        if (nums.length==i)
            return ans;
        ans+=check(nums,i,i+1,0);
        return recusion(nums,i+1,ans);
    }
    public static int check(int[] nums, int i, int j, int ans){
        if (j==nums.length)
            return ans;
        if (nums[i]==nums[j]){
            ans+=1;
        }
        return check(nums,i,j+1,ans);
    }

}

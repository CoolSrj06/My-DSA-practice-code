public class House_Robber {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int firstTry=money(nums,0);
        int secTry=money(nums,1);
        return Math.max(firstTry, secTry);
    }
    public static int money(int[] nums,int start){
        int sum=0;
        for (int i = start; i < nums.length; i+=2) {
            sum+=nums[i];
        }
        return sum;
    }
}

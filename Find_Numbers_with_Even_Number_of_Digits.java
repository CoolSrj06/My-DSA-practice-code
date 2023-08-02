public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] numbs={555,901,482,1771};
        System.out.println(findNumbers(numbs));
    }
    public static int findNumbers(int[] nums) {
        int ans=0;
        for (int num : nums) {
            ans += counter(num);
        }
        return ans;
    }
    public static int counter(int n){
        int count=0;
        while (n!=0){
            n=n/10;
            count+=1;
        }
        if (count%2==0)
            return 1;
        else
            return 0;
    }
}

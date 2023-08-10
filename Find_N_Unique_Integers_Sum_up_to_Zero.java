import java.util.Arrays;

public class Find_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    public static int[] sumZero(int n) {
        int[] arr=new int[n];
        if (n==1)
            return new int[]{0};
        else {
            int sum=0;
            for (int i = 0; i < n-1; i++) {
                arr[i]=i+1;
                sum+=i;
            }
            arr[n-1]= -sum;
        }
        return arr;
    }
}

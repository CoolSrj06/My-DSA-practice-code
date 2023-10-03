import java.util.ArrayList;
import java.util.Arrays;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
        int[] arr={1};
        if (arr.length==1){
            System.out.println(Arrays.toString(arr));
            System.exit(0);
        }
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void solution (int[] arr){
        int[] ans=new int[arr.length-1];
        if (ans.length==1) {
            System.out.println(Arrays.toString(ans));
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            ans[i]=arr[i]+arr[i+1];
        }
        solution(ans);
        System.out.println(Arrays.toString(ans));
    }
}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
//        long r=0;int[] ans;
//        if (digits.length==1&&digits[0]==0)
//            return new int[]{1};
//        for (int i = 0; i < digits.length; i++) {
//            r=r*10+digits[i];
//        }
//        if((int)Math.log10(r)!=(int) Math.log10(r+1))
//            ans=new int[digits.length+1];
//        else
//            ans=new int[digits.length];
//        r=r+1;
//        int index= ans.length-1;
//        while (r!=0){
//            ans[index]= (int) (r%10);
//            r=r/10;
//            index--;
//        }
//        return ans;


            List<Integer> res = new LinkedList<>();
            int k=1;
            for (int i = digits.length - 1; i >= 0; --i) {
                res.add(0, (digits[i] + k) % 10);
                k=(digits[i]+k)/10;
            }
            int[] ans=new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                ans[i]= res.get(i);
            }
            return ans;
    }
}

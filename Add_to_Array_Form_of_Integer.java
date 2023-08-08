import java.util.*;
public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
//        int[] num={9,9,9,9,9,9,9,9,9,9};
        int[] num={0};
        int k=123;
//        int[] num={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};

        System.out.println(addArrays(num,k));
    }
    public static List<Integer> addArrays(int[] num,int k) {
        int[] knum;
        if (num.length>=Math.log10(k)+1) {
            knum=new int[num.length];
            int j = num.length - 1;
            while (k != 0) {
                knum[j] = k % 10;
                k = k / 10;
                j--;
            }
        }else {
            int j=(int)Math.log10(k);
            knum=new int[j+1];
            while (j>-1) {
                knum[j] = k % 10;
                k = k / 10;
                j--;
            }
        }
        int len;
        List<Integer> ans=new ArrayList<>();
        if (num.length>=knum.length)
            len= num.length;
        else
            len=knum.length;
        for (int i= len-1,j=0;i> -1;i--,j++){
            if (num.length>=j)
                ans.add(num[j]+knum[i]);
            else
                ans.add(knum[i]);
        }
        for (int i= num.length-1;i>-1;i--){
            if(ans.get(i)>=10){
                ans.set(i, ans.get(i)-10);
                if (i!=0)
                    ans.set(i-1, ans.get(i-1)+1);
                else
                    ans.add(0,1);
            }
        }
        return ans;
//        long r=0;
//        int i=0;
//        while(i!= num.length){
//            r=r*10+num[i];
//            i++;
//        }
//        long sum=r+k;
//        i=0;
//        List<Integer> ans=new ArrayList<>(2);
//        ans.add((int) (sum%10));
//        sum=sum/10;
//        while(sum!=0){
//            ans.add(0,(int)sum%10);
//            sum=sum/10;
//        }
//        if (ans.isEmpty()){
//            ans.add(0);
//        }
//        return ans;
    }

//    public static List<Integer> addToArrayForm(int[] num, int k) {
//        long r=0;
//        int i=0;
//        while(i!= num.length){
//            r=r*10+num[i];
//            i++;
//        }
//        long sum=r+k;
//        i=0;
//        List<Integer> ans=new ArrayList<>(2);
//        ans.add((int)sum%10);
//        sum=sum%10;
//        while(sum!=0){
//            ans.add(0,(int)sum%10);
//            sum=sum/10;
//        }
//        return ans;
//    }
}

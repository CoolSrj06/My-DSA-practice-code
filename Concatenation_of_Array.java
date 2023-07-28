import java.util.*;
public class Concatenation_of_Array
{
    public static void main(String[] args) {
        int[] n={1,2,1};
        int[] ans= new int[2*n.length];
        int c=0,i=0;
        while(c!= ans.length){
            if(i==n.length){
                i=0;
            }
            ans[c]=n[i];
            c++;
            i++;
        }
        System.out.println(Arrays.toString(ans));
    }
}

import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums={2,2,7,5,7};
        int[] index={0,1,1,0,4};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        return insertion(nums,index,new int[index.length],0);
    }
    public static int[] insertion(int[] nums, int[] index,int[] target,int i){
        if(i==index.length)
            return target;
        shifter(target,index[i]);
        target[index[i]]=nums[i];
        return insertion(nums,index,target,i+1);
    }
    public static int[] shifter(int[] target,int shift){
        if(shift<target.length-2)
            shifter(target,shift+1);
        if (target.length-1!=shift) {
            int temp = target[shift];
            target[shift + 1] = temp;
        }
        return target;
    }
}

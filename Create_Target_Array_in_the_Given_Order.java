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

/**
 We can optimize the code to achieve a linear time complexity of O(n) by avoiding unnecessary element shifting in the target array.
 Instead of using recursion and shifting elements, we can use an ArrayList to build the target array in a single pass.
 Here's the updated code:
 */


/*
import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums = {2, 2, 7, 5, 7};
        int[] index = {0, 1, 1, 0, 4};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] target = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            target[i] = targetList.get(i);
        }

        return target;
    }
}

 */

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }

    public static boolean canJump(int[] nums) {
        int check=0,i=0;
        while (check< nums.length-1)
        {
            if (nums[i]==0) {
                check = i;
                break;
            }
            check+=nums[i];
            i=check;
        }
        return check == nums.length - 1;
    }

//        int reachable = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i > reachable) return false;
//            reachable = Math.max(reachable, i + nums[i]);
//        }
//        return true;
//    }
}

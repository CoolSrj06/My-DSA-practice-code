//import java.util.Arrays;
//
//public class Find_Right_Interval {
//    public static void main(String[] args) {
//        int[][] nums={{4,4}};
//        System.out.println(Arrays.toString(findRightInterval(nums)));
//    }

    /*
   if (intervals.length==1&&intervals[0][0]!=intervals[0][1])
            return new int[]{-1};
        int count=0;
        int[] ans=new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                    if (intervals[j][0] >= intervals[i][1]) {
                        if(count>0 && intervals[ans[i]][0]>=intervals[j][0])
                            ans[i] = j;
                        if(count==0){
                            ans[i]=j;
                            count = 1;
                        }
                    }
            }
            if (count==0)
                ans[i]=-1;
            count=0;
        }
        return ans;
        }
     */

//    public static int[] findRightInterval(int[][] intervals) {
//        int[][] nums=new int[intervals.length][3];
//    }
//}

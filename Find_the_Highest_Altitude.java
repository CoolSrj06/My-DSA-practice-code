import java.util.Arrays;

public class Find_the_Highest_Altitude {
    public static void main(String[] args) {
        int[] gain ={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] alt=new int[gain.length+1];
        for (int i = 1; i < alt.length; i++) {
            alt[i]=alt[i-1]+gain[i-1];
        }

        int highest=0;
        for (int j : alt) {
            if (highest < j)
                highest = j;
        }
        return highest;
    }
}

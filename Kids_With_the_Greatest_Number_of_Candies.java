import java.util.*;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies ={2,0,5,1,3};
        int extraCandies=3;
        boolean[] ans;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return recusrion(candies,extraCandies,0,new ArrayList<>());
    }
    public static List<Boolean> recusrion(int[] candies, int extraCandies, int i, List<Boolean> ans){
        if(i==candies.length)
            return ans;
        ans.add(i, check(candies, candies[i] + extraCandies, 0, i, false));
        return recusrion(candies,extraCandies,i+1,ans);
    }
    public static boolean check(int[] candies,int ifmax,int i,int j,boolean checker){
        if (i==j)
            return check(candies,ifmax,i+1,j,checker);
        if (i==candies.length)
            return checker;
        if (candies[i]<=ifmax)
            return check(candies,ifmax,i+1,j,true);
        else
            return false;
    }
}

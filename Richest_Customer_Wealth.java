import java.util.Arrays;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
    int[][] accounts={{1,5},{7,3},{3,5}};
        System.out.println(richest(accounts,0,0,0));
    }

    //iterating over columns
    public static int richest(int[][] account, int i,int sum,int ans){
        if(i == account.length)
            return ans;
        else {
            sum = add(account, i, 0, 0);//adding the element of a particular column
            if(ans<sum)
                ans=sum;
        }
        return richest(account,i+1,sum,ans);
    }

    /* iterating over rows and adding them */
    public static int add(int[][] account,int i,int j,int sum){
        if(j== account[i].length)
            return sum;
        else
            sum +=account[i][j];
        return add(account,i,j+1,sum);
    }
}

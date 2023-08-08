public class Maximum_Population_Year {
    public static void main(String[] args) {
        int[][] logs={{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}};
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int[] arr=new int [101];
        for (int i=0;i<=101;i++){
            int[]log=logs[i];
            arr[log[0]-1950]++;
            arr[log[0]-1950]--;
        }
        int max=arr[0];
        int year=1950;
        for (int i = 1; i < 101; i++) {
            arr[i]+=arr[i-1];
            if (arr[i]>max){
                max=arr[i];
                year=1950+1;
            }
        }
        return year;
    }

}

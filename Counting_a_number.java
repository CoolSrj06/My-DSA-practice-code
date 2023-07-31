/*Print the number of 7 in a 2D array */
public class Counting_a_number {
    public static void main(String[] args) {
        int[][] array= {{7,7,8},{7,8,7}};
        System.out.println(count(array,7,0));
    }
    public static int count (int[][] array, int num,int counter){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (array[i][j]==num)
                    counter+=1;
            }
        }
        return counter;
    }
}

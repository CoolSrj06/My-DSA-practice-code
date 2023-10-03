import javax.naming.PartialResultException;

public class Magnetic_Force_Between_Two_Balls {
    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{5,4,3,2,1,1000000000},2));
    }
    public static int maxDistance(int[] position, int m) {
        quickSort(position,0,position.length-1);
        int ans=0;
        int start=0;
        int end=position[position.length-1]-position[0];
        while (start<=end){
            int mid=start+(end-start)/2;
            if (isPossible(position,m,mid)){
                ans=mid;
                start=mid+1;
            }else
                end=mid-1;
        }
        return ans;
    }
    public static boolean isPossible(int[] position,int count,int k){
        int start=position[0];
        int c=1; int d;
        for (int i = 1; i < position.length; i++) {
            d=position[i]-start;
            if (d>=k){
                c+=1;
                start=position[i];
            }
        }
        return c>=count;
    }
    public static void quickSort(int[] arr,int low,int high){
        if (low>=high)
            return;
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while (start<=end){
            while (arr[start]<pivot)
                start+=1;
            while (arr[end]>pivot)
                end-=1;
            if (start<=end) {
                int t = arr[start];
                arr[start] = arr[end];
                arr[end] = t;
                end--;
                start++;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
}

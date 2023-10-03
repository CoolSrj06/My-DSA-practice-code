public class Wood_cutter_problem {
    public static void main(String[] args) {
        int[] arr={4,42,40,26,46};
        QuickSort(arr,0,arr.length-1);
        System.out.println(perfectCut(arr,20));
    }
    public static void QuickSort(int[] arr,int low,int high){
        if (low>=high)
            return;
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while (start<=end){
            while (pivot>arr[start])
                start++;
            while (arr[end]>pivot)
                end--;

            if (start<=end){
                int t=arr[start];
                arr[start]=arr[end];
                arr[end]=t;
                end--;
                start++;
            }
        }
        QuickSort(arr,low,end);
        QuickSort(arr,start,high);
    }
    public static int perfectCut(int[] arr,int target){
        int start=0;
        int end=arr[arr.length-1];
        int heightSetter=0;
        int sum=0;
        while (start<end){
            sum=0;
            int mid=start+(end-start)/2;
            //heightSetter=mid+end;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>mid)
                    sum+=arr[i]-mid;
            }
            if (sum>target)
                start=mid+1;
            else if (sum<target)
                end=mid-1;
            else break;
        }
        return sum;
    }
}

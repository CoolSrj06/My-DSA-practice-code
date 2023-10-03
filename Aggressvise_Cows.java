/* public class Aggressvise_Cows {
    #include <iostream>
    using namespace std;

    bool isPossible(int arr[], int n, int mid, int count){

        int cows = 1;
        int start = arr[0];

        for(int i=1; i<n; i++){

            int d = arr[i] - start;

            if( d >= mid ){
                cows += 1;
                start = arr[i];
            }
            if(cows == count){
                return true;
            }
        }
        return false;
    }


    int main(){
        int stalls[5] = {3,5,8,12,20};
        int count = 3;

        int s = 0;
        int e = stalls[4] - stalls[0];

        int mid, ans;

        while(s<=e){

            mid = s + (e-s)/2;

            if(isPossible(stalls, 5, mid, count)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        cout<<"minimum distance: "<<ans;
    }
}
*/


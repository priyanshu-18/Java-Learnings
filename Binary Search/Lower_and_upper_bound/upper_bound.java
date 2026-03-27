public class upper_bound {

static int upper_bound(int arr[], int low, int high, int ans, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) { // just here change 
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
            return ans;
    }
    public static void main(String[] args) {
        

        
        int arr[]={1,2,3,4,5,5,5,5,5,6,6,7,8};
        int low=0;
        int high=arr.length-1;
        int ans = arr.length;
        int lower =upper_bound(arr,low,high,ans,5);
        System.out.println(lower);
    }
}

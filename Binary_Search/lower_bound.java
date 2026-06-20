package Binary_Search;

public class lower_bound {
    public static void main(String[] args) {
        //Lower Bound Used to find the first occurance and insert a posn where;

        int nums[]={3,4,6,6,6,7,9,10,13,17,18,22,33};
        int target =6;
        int n = nums.length;
        int ans = nums.length;

        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = low + (high - low)/2;

            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        System.out.println(ans);
        System.out.println(low);  // both gave same answer and both works use any one 

        
    }
}

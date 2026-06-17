package Binary_Search;

public class Binary_search {
    public static void main(String[] args) {
        
        int nums[]={3,4,6,7,9,10,13,17,18,22,33};
        int n = nums.length;

        int low=0;
        int high=n-1;
        int target=6;

        while(low<=high){
            
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(nums[mid]>target) high = mid-1;
            else low = mid+1;

         }


    }
}

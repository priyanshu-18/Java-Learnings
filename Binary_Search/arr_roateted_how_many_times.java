package Binary_Search;

public class arr_roateted_how_many_times {
    public static void main(String[] args) {
        
        int nums[]={4,5,6,7,0,1,2,3};
        int n = nums.length;

        int low=0;
        int high = n-1;
        int min_value= Integer.MAX_VALUE;
        int index = -1;

        while(low<=high){

            int mid = low + (high -low)/2;

            if(nums[low]<=nums[mid]){ //left
                if(nums[low]<min_value){
                    min_value=nums[low];
                    index = low;
                }
                low = mid+1;
            }else{
                if(nums[mid]<min_value){
                    min_value=nums[mid];
                    index = mid;
                }
            }

        }
        System.out.println(index); 
    }
}

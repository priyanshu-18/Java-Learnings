package Binary_Search;

public class find_the_smalles_divisor {
    public static void main(String[] args) {
        int nums[]={1,2,5,9};
        int threshold = 6;

         int low = 1;
        int high = 0;
        long res=-1;

        for(var num : nums){
            high = Math.max(high,num);
        }
        

        while(low<=high){

            int mid = low + (high -low)/2;

            long val=0;

            for(var num : nums){
                val += Math.ceil((double)num/mid);
            }

            if(val<=threshold){
                res = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }

        }

        System.out.println((int)res);

    }
}

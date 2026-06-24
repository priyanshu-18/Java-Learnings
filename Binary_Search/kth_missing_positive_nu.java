package Binary_Search;

public class kth_missing_positive_nu {
    public static void main(String[] args) {

        // ==========================
        // ===== Brute Force ========
        // ==========================
        
        // int nums []={2,3,4,7,11};
        // int k = 5;


        // int num =1;
        // int i=0;
        // while(k>0 && i<nums.length){
            
        //     if(nums[i]==num){
        //         i++;
        //     }else{
        //         k--;
        //     }
        //     num++;
        
        // }

        // while(k>0){
        //     num++;
        //     k--;
        // }

        // System.out.println(num-1);

        // ==========================
        // ===== Optimal  ===========
        // ==========================

        int nums []={2,3,4,7,11};
        int k = 5;

        int low = 0;
        int high = nums.length-1;

        while(low<=high){

            int mid = low + (high - low)/2;


            if((nums[mid]-(mid+1))<k){
                low = mid +1;
            }else{
                high = mid-1;
            }


        }

        System.out.println( low + k);



    }
}

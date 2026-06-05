package Arr.Medium;

public class kadane_algorithm {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int n = nums.length;

        int max_sum=Integer.MIN_VALUE;
        
        // ==========================
        // ===== Brute Force =====
        // ==========================
        // for(int i=0;i<n;i++){
        //     int sum=0;i
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum>max_sum){
        //             max_sum=sum;
        //         }
        //     }
        // }


        // =======================================
        // ===== Optimal (Kande's Algorithm) =====
        // =======================================
        
    //     int sum=0;


    //     for(int i=0;i<n;i++){
    //         sum+=nums[i];

    //         if(sum>max_sum){
    //             max_sum=sum;
    //         }
    //         if(sum<0){
    //             sum=0;

    //         }
    //     }

    // System.out.println(max_sum);







    // ==========================
    // ===== Print subbary of the max sum  =====
    // ==========================

            int sum=0;
            int start=0;
            int end=0;
            int tempstart=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(sum>max_sum){
                max_sum=sum;
                start = tempstart;
                end=i;
            }
            if(sum<0){
                sum=0;
                tempstart=i+1;

            }
        }

        for(int i=0;i<n;i++){
            if()
        }
}
}

   

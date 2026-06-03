public class Largest_subaaray_with_given_sum_k {


    public static void main(String[] args) {
        // ==========================
        // ===== Brute Force =====
        // ==========================
        // int arr[]={1,2,1,1,1};
        // int K=3;
        
        // int max_sum =0;
        // int max_length=0;
        

        // for(int i =0 ;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         int sum =0;
        //         int length=j-i+1;
        //         for(int k=i;k<=j;k++){
        //                 sum += arr[k];
        //             }
        //             if(sum==K){
        //                 if(length>max_length ){
        //                     max_length = length;
        //                 }
        //             }

        //     }

        // }
        //System.out.println(max_length);


        // ==========================
        // ===== Better =============
        // ==========================
        int arr[]={1,2,1,1,1};
        int K=3;
        

        int max_length=0;
        
        
        for(int i =0 ;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                int length=j-i+1;
                
                    if(sum==K){
                        if(length>max_length ){
                            max_length = length;
                        }
                    }

            }

        }
        System.out.println(max_length);
        
    }
}

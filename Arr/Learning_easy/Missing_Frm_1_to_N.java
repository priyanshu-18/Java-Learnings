public class Missing_Frm_1_to_N {
    public static void main(String[] args) {

        // ==========================
        // ===== Brute Force ========
        // ==========================


        //! int arr[]={1,2,3,4,5};
        // int n=6;
        // for(int j=1;j<=n;j++){
            
        //     boolean found = false;
            
        //     for(int i=0;i<arr.length;i++){
        //         if(arr[i]==j){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         System.out.println(j);
        //     }else{
        //         System.out.println("not missing");
        //     }
            
        
        // ==========================
        // ===== Optimal soln =======
        // ==========================


        int nums[] = {1,2,3,4,5};
        int n =6;
        int arr_sum=0;
        int sum_of_n = (n *(n+1) )/2;

        for(int i=0;i<nums.length;i++){
           arr_sum += nums[i];

        }

        System.out.println(sum_of_n-arr_sum);


        // ==========================
        // ===== Xor Approach =======
        // ==========================


        int Xor_n_sum =0;
        int Xor_arr_sum =0;

        for(int i=1;i<=n;i++){
            Xor_n_sum ^=i;

        }
        for(int i=0;i<nums.length;i++){
            Xor_arr_sum ^=nums[i];
        }

        System.out.println(Xor_n_sum^Xor_arr_sum);




    }
    
        
    }


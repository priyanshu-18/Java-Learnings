package Arr.Hard;

import java.util.HashMap;

public class largest_subarray_with_sum_0 {
    public static void main(String[] args) {
        // ==========================
        // ===== Brute Force ========
        // ==========================


        // int nums[]={9, -3, 3, -1, 6, -5};
        // int n = nums.length;
        // int max_length=0;


        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==0){
        //             int length = j-i+1;
        //             if(length>max_length){
        //                 max_length=length;
        //             }
        //         }
        //     }
        // }
        // System.out.println(max_length);


        // ======================================
        // ===== Optimal (HashMap + prefix) =====
        // ======================================


        int nums[]={9, -3, 3, -1, 6, -5};
        int n = nums.length;
        
        HashMap<Integer,Integer> hash = new HashMap<>();
       int max_length = 0;
       int prefix_sum =0;

       for(int i = 0;i<n;i++){
        prefix_sum += nums[i];

        if(prefix_sum==0){

            max_length=i+1;
        }
        

        if(hash.containsKey(prefix_sum)){
            int length = i - hash.get(prefix_sum);

            if(length>max_length){
                max_length=length;
            }

        }else{
            hash.put(prefix_sum, i);
        }

       }
       System.out.println(max_length);
       


    }
}

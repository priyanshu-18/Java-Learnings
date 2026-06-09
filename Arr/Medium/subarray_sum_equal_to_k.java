package Arr.Medium;

import java.util.HashMap;

public class subarray_sum_equal_to_k {
    public static void main(String[] args) {
        // ==========================
        // ===== Brute Force =====
        // ==========================

        // int  nums[] = {1,1,1};
        // int k = 2;
        // int n = nums.length;
        // int count=0;
        // for(int i =0;i<n;i++){
        //     int sum=0;
        //     for(int j =i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
            
        // }

        // System.out.println(count);


        // ==========================
        // ===== Optimal  =====
        // ==========================

        int nums[]={1,2,3};
        int k=3;
        int count =0;
        int Prefix_sum=0;
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            Prefix_sum+=nums[i];

            int need = Prefix_sum-k;
            if(hash.containsKey(need)){
                count+=hash.get(need);
            }

            hash.put(need, hash.getOrDefault(Prefix_sum,0+1));
        }
        

    }
}

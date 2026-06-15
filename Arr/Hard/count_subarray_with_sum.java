package Arr.Hard;

import java.util.HashMap;

public class count_subarray_with_sum {
    public static void main(String[] args) {
        // ==========================
        // ===== Brute Force =====
        // ==========================

        // int nums[]={4,2,2,6,4};
        // int n = nums.length;
        // int k=6;
        // int count = 0;
        
        // for(int i=0;i<n;i++){
        //     int xor=0;
        //     for(int j=i;j<n;j++){
        //         xor ^= nums[j];
        //         if(xor==k){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);


        // ==========================
        // ===== Optimal  =====
        // ==========================


        int nums[]={4,2,2,6,4};
        int n = nums.length;
        int k=6;
        int xr =0;
        int count =0;

        HashMap<Integer,Integer> hash = new HashMap<>();

        hash.put(0,1);

        for(int i=0;i<n;i++){
            xr^=nums[i];
            int prev = xr ^ k;

            if(hash.containsKey(prev)){
                count+=hash.get(prev);
            }
            hash.put(xr, hash.getOrDefault(xr,0)+1);
        }

        System.out.println(count);

        System.out.println(125%10);





    }
}

package Arr.Medium;

import java.util.HashMap;

public class Two_sum {

    public static void main(String[] args) {

        // ==========================
        // ===== Brute force soln ===
        // ==========================
        // int nums[]={1,2,1,2,3,4};
        // int target =5;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if((nums[i]+nums[j]==target) &&(i!=j)){
        //             // return new int[] {i,j};
        //         }
        //     }
        // }



        // ==========================
        // ===== Optimal ============
        // ==========================

        int arr[]={2,7,11,15};
        int target = 9;
        HashMap hash = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int need = target - arr[i];
            
            if(hash.containsKey(need)){
                System.out.println( hash.get(need)+" "+i);
                break;
            }else{
                hash.put(arr[i],i);
                
            }


        }


    }

}

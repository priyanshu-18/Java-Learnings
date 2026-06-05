package Arr.Medium;

import java.util.HashMap;

public class Majority_element {
    public static void main(String[] args) {

        // ==========================
        // ===== Brute force  =====
        // ==========================


        // int nums[]={3,2,3};
        // int n = nums.length;

        // int count_maj=0;

        // for(int i=0;i<n;i++){
        //     count_maj=0;
        //     for(int j =0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count_maj++;
        //         }
        //     }
        //     if(count_maj>n/2){
        //         System.out.println(nums[i]);
        //         break;
        //     }
        // }
        

        // ==========================
        // ===== Optimal (HashMap) ==
        // ==========================


        // int nums[]={2,2,1,1,1,2,2,1,1};
        // int n =nums.length;

        // HashMap<Integer,Integer> hash = new HashMap<>();
        // for(int i=0;i<n;i++){

        //     if(hash.containsKey(nums[i])){
        //         hash.put(nums[i],hash.get(nums[i])+1);
        //     }else{
        //         hash.put(nums[i], 1);
        //     }
        // }

        // for( var entry : hash.entrySet() ){
        //     if(entry.getValue()> n/2){
        //         System.out.println(entry.getKey());
        //     }
        // }







        // ============================================
        // ===== Optimal (Moore Voting Algorithm) =====
        // ============================================

        int nums[]={2,2,1,1,1,2,2,1,1};

        int count=0;
        int candidate=nums[0];

        for(int i=0;i<nums.length;i++){

            if(count==0){
                candidate=nums[i];
                count=1;
            }
            else if(candidate!=nums[i]){
                count--;
            } 
            else {
                count++;
            }  
        }

        count=0;
        for(var num : nums ){
            if(num==candidate){
                count++;
            }
        }

        if(count > nums.length/2){

            System.out.println(candidate);
        }else{
            System.out.println(1);
        }



    }
}

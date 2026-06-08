package Arr.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class longest_consecutive {
    public static void main(String[] args) {
        
    // ==========================================================
    // ===== Brute force (O(n^2) and better is (n+n lon n)) =====
    // ==========================================================


        int nums[] = {100,4,200,1,3,2};
        int n = nums.length;

        // this is better 

        // if(nums.length == 0){
        // return;
        // }

        // Arrays.sort(nums);

        // System.out.println(Arrays.toString(nums));
        // int count=1;
        // int max_Count=1;

        // for(int i=1;i<n;i++){
        //     if(nums[i]==(nums[i-1]+1)){
        //         count++;
        //     }
        //     else if(nums[i]==nums[i-1]){    


        //         }else{
        //         count=1;
        //     }

        //     max_Count = Math.max(max_Count, count);
            
        // }
        // System.out.println(max_Count);


    // ==========================
    // ===== Optimal (HashMap failed) because of TLE  =====
    // ==========================

    // failed because if the arr contains like smae elment 10 times the second loop do same thing 10 time that create the TLE
    // int count=1;
    // int max_Count=1;
    // HashMap hash = new HashMap<>();

    // for(int i=0;i<n;i++){
    //     hash.put(nums[i], i);

    // }   

    // for(int i=0;i<n;i++){
    //     int current = nums[i];
    //     count=1;
    //     if(!hash.containsKey(nums[i]-1)){

    //         while(hash.containsKey(current+1)){
    //                 count++;
    //                 current+=1;
    //             }
    //         }
    //         max_Count=Math.max(max_Count, count);
    //     }




    // ==========================
    // ===== Optimal HashSet =====
    // ==========================


    
    int max_Count=1;
    HashSet<Integer> hash = new HashSet<>();

    for(int i : nums){
        hash.add(i);
    }

    for(int num : hash){
        int count=1;
        if(!hash.contains(num-1)){
            int current=num;

            while(hash.contains(current+1)){
                current++;
                count++;
            }
        }
        max_Count = Math.max(max_Count, count);
    }
    System.out.println(max_Count);



    
    }
    

}



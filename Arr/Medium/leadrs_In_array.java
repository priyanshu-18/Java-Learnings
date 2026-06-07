package Arr.Medium;
import java.util.*;
public class leadrs_In_array {
    public static void main(String[] args) {
        // ==========================
        // ===== Brute force ========
        // ==========================
        int nums[]={10,22,13,3,0,6};
        int n = nums.length;
        int max_leaders=Integer.MIN_VALUE;



        // for(int i=0;i<n;i++){
        //     boolean leader=false;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[j]>nums[i]){
        //             leader=true;
        //             break;
        //         }
                    
        //     }

        //     if(!leader){
        //         System.out.println(nums[i]);
        //     }

        // }


        // ==========================
        // ===== Optimal solution ===
        // ==========================

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>max_leaders){
                System.out.println(nums[i]);
                max_leaders = nums[i];
            }
        }




    }
}

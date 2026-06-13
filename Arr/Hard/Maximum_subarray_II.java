package Arr.Hard;

import java.util.ArrayList;
import java.util.Collections;

public class Maximum_subarray_II {
    public static void main(String[] args) {

        // ==========================
        // ===== Brute Force ========
        // ==========================
        
        int nums[]={4,2,5,1};
        int k=3;
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        
        for(int i=0;i<n;i++){
            int maximum=Integer.MIN_VALUE;
            int minimum=Integer.MAX_VALUE;
            
            for(int j=i;j<n;j++){

                maximum = Math.max(maximum,nums[j]);
                minimum = Math.min(minimum,nums[j]);
                list.add(maximum-minimum);
            }
        }
        int sum=0;
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<k;i++){
            sum+=list.get(i);
        }
        System.out.println(sum);






        // ==========================
        // ===== Optimal  ===========
        // ==========================

        // int nums[]={4,2,5,1};
        // int k=3;
        // int n = nums.length;


        
        

      }


}

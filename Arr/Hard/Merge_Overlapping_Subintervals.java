package Arr.Hard;

import java.util.*;

public class Merge_Overlapping_Subintervals {
    public static void main(String[] args) {

        // ==========================
        // ===== Optimal  =====
        // ==========================
        int nums[][]={
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };

        List<List <Integer>> list = new ArrayList<>();

        Arrays.sort(nums, (a,b) -> Integer.compare(a[0],b[0]));

        int n = nums.length;


        int start =  nums[0][0];
        int end = nums[0][1];

        for(int i=1;i<n;i++){

            if(end >= nums[i][0]){
                end = Math.max(end, nums[i][1]);
            }else{

                List<Integer> row = new ArrayList<>();

                row.add(start);
                row.add(end);
                list.add(row);

                start = nums[i][0];
                end = nums[i][1];

            }

        }

        // List<Integer> row = new ArrayList<>();

        //         row.add(start);
        //         row.add(end);
        //         list.add(row);


        System.out.println(list);



    }
}

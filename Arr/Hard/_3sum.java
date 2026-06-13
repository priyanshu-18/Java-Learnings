package Arr.Hard;

import java.util.*;

public class _3sum {
    public static void main(String[] args) {
        // ==========================
        // ===== Brute Force  =======
        // ==========================
//         int nums[] = {-1,0,1,2,-1,-4};
//         int n= nums.length;
        
//         Set<List<Integer>> list = new HashSet<>();
        
//         for(int i=0;i<n;i++){
            
//             for(int j=i+1;j<n;j++){
                
//                 for(int k=j+1;k<n;k++){
//                     if((nums[i]+nums[j]+nums[k])==0){
//                         List<Integer> row = new ArrayList<>();
//                         row.add(nums[i]);
//                         row.add(nums[j]);
//                         row.add(nums[k]);

//                         Collections.sort(row);
//                         list.add(row);
//                     }
//                 }
//             }

            
            
//         }
//         List<List<Integer>> list1 = new ArrayList<>(list);
//         System.out.println(list1);




        // =================================================
        // ===== Optimal (Using Two Pointer + sorting) =====
        // =================================================



        int nums[]= {-1,0,1,2,-1,-4};
        int n= nums.length;

        Arrays.sort(nums);
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int left =i+1;
            int right=n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(left<right){
                int sum =nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> row = new ArrayList<>();
                    row.add(nums[i]);
                    row.add(nums[left]);
                    row.add(nums[right]);
                    list.add(row);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
    }
    
}

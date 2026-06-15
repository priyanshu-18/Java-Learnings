package Arr.Hard;

import java.util.HashMap;

public class Find_Misisng_reapting{

    public static void main(String[] args) {
        
        // ==========================
        // ===== Brute Force ========
        // ==========================


        // int nums[] = {1, 3, 3}; 
        // int n = nums.length;

      
        // int missing =0;
        // int repeating =0;
        // for(int i=1;i<=n;i++){
        //         int count=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             count++;
        //         }
                
        //     }
        //     if(count==2){
        //     repeating=i;
        //     }
        //     if(count==0){
        //         missing=i;
        //     }
        // }
        // System.out.println(missing+" "+repeating);



        // ==========================
        // ===== Better =============
        // ==========================

        // int nums[] = {1, 3, 3}; 
        // int n = nums.length;
      
        // HashMap<Integer,Integer> hash = new HashMap<>();

        // for(int i=0;i<n;i++){
        //     if(hash.containsKey(nums[i])){
        //         hash.put(nums[i], hash.get(nums[i])+1);
        //     }
        //     else{
        //         hash.put(nums[i],1);
        //     }

        // }

        // int missing=0;
        // int repeting=0;


        // for(int i=1;i<=n;i++){
        //     if(!hash.containsKey(i)){
        //         missing=i;
        //     }
        //     else if(hash.get(i)==2){
        //         repeting =i;

        //         }
        // }

        // System.out.println(missing + " " + repeting);


        // ==========================
        // ===== Optimal (Maths) ====
        // ==========================

    //     int nums[] = {1, 3, 3}; 

    //     long n = nums.length;
     
    //     long sum_of_1_to_n = (n*(n+1))/2;

    //     long sum_of_Array = 0;

    //     for(int i=0;i<n;i++){
    //         sum_of_Array +=nums[i];
    //     }

    //     long val1 = sum_of_Array - sum_of_1_to_n;


    //     long sum_of_square_1_to_n = (n*(n+1)*(2*n+1))/6;

    //     long sum_of_square_Array = 0;

    //     for(int i=0;i<n;i++){

    //     sum_of_square_Array += (long)nums[i]*nums[i];

    //     }

    //     long val2 = sum_of_square_Array - sum_of_square_1_to_n;
    //     val2 = val2 / val1;


    //     long x = (val1+val2)/2;

    //     long y = x - val1;

    //     System.out.println(x + " " +y);

    // }


    // ==========================
    // ===== Optimal (XOr) -======
    // ==========================

       int nums[] = {1, 3, 3}; 
        int n = nums.length;

        int xor1=0;
        int xor2=0;

        for(int i=0;i<n;i++){
            xor1 ^= nums[i];
            xor2 ^= (i+1);

        }

        xor1 = xor1 ^ xor2;
        int bitNo = xor1 & (-xor1);


        int zero =0;
        int one =0;

        for(int i=0;i<n;i++){

            if((nums[i] & bitNo )!=0){
                one ^=nums[i];
            }else{
                zero ^=nums[i];
            }
            if(((i+1) & bitNo )!=0){
                one ^=(i+1);
            }else{
                zero ^=(i+1);
            }

        }

        System.out.println(one + " " + zero);
     

    
}
}
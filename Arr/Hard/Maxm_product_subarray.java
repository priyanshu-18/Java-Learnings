package Arr.Hard;

public class Maxm_product_subarray {
    public static void main(String[] args) {

        // ==========================
        // ===== Brute Force ========
        // ==========================


        // int nums[]={2,3,-2,4};
        // int n = nums.length;

        // int max_product=Integer.MIN_VALUE;
        
        // for(int i=0;i<n;i++){
        //     int product =1;

        //     for(int j=i;j<n;j++){
                
        //         product *=nums[j];

        //         if(product > max_product){
        //             max_product=product;
        //         }
        //     }
        // }

        // System.out.println(max_product);


        // ==========================
        // ===== Optimal  =====
        // ==========================


        int nums[]={2,3,-2,4};
        int n = nums.length;

        int left = 0;
        int right=n-1;

        int left_product =1;
        int right_product=1;

        int max_product =Integer.MIN_VALUE;

        while(left<n){
            left_product *= nums[left];
            right_product *= nums[right];
            if(left_product > max_product){
                max_product = left_product;
            }
            if( right_product>max_product){
                max_product= right_product;
            }

            if(left_product==0){
                left_product=1;
            }
            if(right_product ==0){
                right_product=1;
            }
            left++;
            right--;
            
        }

        System.out.println(max_product);


    }
}

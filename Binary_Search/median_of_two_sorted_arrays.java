package Binary_Search;

public class median_of_two_sorted_arrays {

    public static double binary_search(int arr1[],int arr2[]){
        
        int n = arr1.length;
        int m = arr2.length;
        
        int low=0;
        int high = n;
        while(low<=high){

            int cut1 = low + (high - low)/2;

            int leftHalf = (n+m+1)/2;

            int cut2 = leftHalf - cut1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;

            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            
            
           if(cut1>0){
            l1 = arr1[cut1-1];
           }
           if(cut1<n){
            r1 = arr1[cut1];
           }    
           if(cut2>0){
            l2=arr2[cut2-1];
           }
           if(cut2<m){
            r2=arr2[cut2];
           }


           if(l1<=r2 && l2<=r1){
            if((n+m)%2==0){
                return (Math.max(l1, l2)+Math.min(r1,r2))/2.0;
            }else{
                return 1D*Math.max(l1,l2);
            }
           }else if(l1>r2){
           high = cut1 -1;
           }else{
            low = cut1+1;;
           }
           

           



        }
        return -1.0;

    }
    public static void main(String[] args) {

        // ==========================
        // ===== Brute Force ========
        // ==========================

        // int nums1[]={1,3};
        // int nums2[]={2,4};
        // int low =0;
        // int high =0;

        // int n = nums1.length;
        // int m = nums2.length;


      
        
        // int leftIndex =((n+m)/2)-1;
        // int rightIndex=(n+m)/2;

        // int leftValue=0;
        // int rightValue=0;

        // int count=0;


        // while(low<n && high<m){

        //     if(nums1[low]<=nums2[high]){
        //         if(count==leftIndex){
        //             leftValue= nums1[low];
        //         }else if(count==rightIndex){
        //             rightValue=nums1[low];
        //         }
        //         count++;
        //         low++;
                
        //     }else{
        //         if(count==leftIndex){
        //             leftValue= nums2[high];
        //         }else if(count==rightIndex){
        //             rightValue=nums2[high];
        //         }
        //         count++;
        //         high++;

        //     }
            
        // }

        // while(low<n){
        //      if(count==leftIndex){
        //             leftValue= nums1[low];
        //         }else if(count==rightIndex){
        //             rightValue=nums1[low];
        //         }
        //         count++;
        //         low++;
        // }

        // while (high<m) {
        //     if(count==leftIndex){
        //             leftValue= nums2[high];
        //         }else if(count==rightIndex){
        //             rightValue=nums2[high];
        //         }
        //         count++;
        //         high++;
            
        // }

        // if((n+m)%2==0){
        //     System.out.println((leftValue+rightValue)/2);
        // }else{
        //     System.out.println(rightValue);

        // }


        // ==========================
        // ===== Optimal  ===========
        // ==========================

        int nums1[]={1,3,8,9};
        int nums2[]={2,4,5,7};

        int n = nums1.length;
        int m = nums2.length;

        

        if(n>m){
            System.out.println(binary_search(nums2,nums1));
        }else{
            System.out.println(binary_search(nums1,nums2));
        }


    }
}

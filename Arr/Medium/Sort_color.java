package Arr.Medium;
import java.util.Arrays;

public class Sort_color {
    
    static void  swap(int arr[],int low,int high){
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;

    }
    
    public static void main(String[] args) {

        // ==========================
        // ===== Brute Force  =====
        // ==========================


            // we can use bubble sort , slection & Insetion sortin but the problem is TC is O(n^2); so we dont gone to write the code ok 


        // ==========================
        // ===== Better  =====
        // ==========================
        
        // int arr[]={2,0,2,1,1,0};
        // int count0=0;
        // int count1=0;
        // int count2=0;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         count0++;
        //     }
        //     else if(arr[i]==1){
        //         count1++;
        //     }
        //     else if(arr[i]==2){
        //         count2++;
        //     }
        // }

        // int index=0;

        // while(count0>0){
        //     arr[index]=0;
        //     index++;
        //     count0--;
        // }
        // while(count1>0){
        //     arr[index]=1;
        //     index++;
        //     count1--;
        // }
        // while(count2>0){
        //     arr[index]=2;
        //     index++;
        //     count2--;
        // }

        // System.out.println(Arrays.toString(arr));



        // ==========================
        // ===== Optimal one  =====
        // ==========================

        //Dutch nation algorithm 

        int nums[]={2,0,2,1,1,0};
        
        int low =0;
        int mid =0;
        int high =nums.length-1;


        while(mid<=high){
            if(nums[mid]==2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }

        }

        System.out.println(Arrays.toString(nums));


    

    }
}

            
        

        


    

   
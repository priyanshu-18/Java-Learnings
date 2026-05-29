import java.util.Arrays;

public class Rotate_Array_by_1_and_k {

    static void reverse(int arr[]){
        int low=0;
        int high =arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    static void reverse_first_half(int arr[],int K){
        int low=0;
        int high =K-1;
        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    static void reverse_Second_half(int arr[],int K){
        int low=K;
        int high =arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        
        
        // ==============================================
        // ===== THIS IS FOR ROTATE ARRAY LEFT BY 1 =====
        // ==============================================
        
        
        //! int arr[]={1,2,3,4,5};
        // int temp = arr[0];
        // for(int i=1;i<arr.length;i++){
        //     arr[i-1]=arr[i];
        // }
        // arr[arr.length-1]=temp;
       // System.out.println(Arrays.toString(arr));

        // ===================================
        // ===== ROTATE ARRAY LEFT BY K  =====
        // ===================================
        
        int arr1[] = {7,1,2,3,4};
        int k = 3;
        int Ext_arr[] = new int[k];
        for(int i =0;i<k;i++){
            Ext_arr[i]=arr1[i];
        }
        
        for(int i=k;i<arr1.length;i++){
            arr1[i-k]=arr1[i];
        }
        int j=0;
        for(int i=arr1.length-k;i<arr1.length;i++){
            arr1[i]=Ext_arr[j];
            j++;
        }
        
        //!System.out.println(Arrays.toString(arr1));
        
        // =====================================================
        // ===== ROTATE ARRAY LEFT BY K  (OPTIMAL SOLUTION)=====
        // =====================================================


        int nums[]={1,2,3,4,5,6,7};
        int k1=3;

        reverse_first_half(nums,k1);
        reverse_Second_half(nums,k1);
        reverse(nums);

        System.out.println(Arrays.toString(nums));


    }
}

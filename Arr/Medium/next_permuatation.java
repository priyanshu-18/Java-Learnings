package Arr.Medium;

import java.util.*;

public class next_permuatation {

    // ==========================
    // ===== Brute Force ========
    // ==========================
    static List<String> prem = new ArrayList<>();

    static void swap(int arr[],int index,int i){
        int temp = arr[index];
        arr[index]=arr[i];
        arr[i]=temp;
    }

    static void rev(int arr[],int start, int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    

    static void permutation(int arr[],int index){
        if(arr.length==index){
            prem.add(Arrays.toString(arr));
            return;
        }
        

        for(int i=index;i<arr.length;i++){
            swap(arr, index, i);

            permutation(arr, index+1);

            swap(arr, index, i);
        }

    }

    public static void main(String[] args) {    
        int arr[] = {1,2,5,4,3};

        permutation(arr,0);
        Collections.sort(prem);

        String current = Arrays.toString(arr);

        int indx = prem.indexOf(current); 

        if(indx==(prem.size()-1)){
            System.out.println(prem.get(0));
        }else{
            System.out.println(prem.get(indx+1));
        }

        




        // ==========================
        // ===== Optimal One ========
        // ==========================

        int nums[]={1,2,5,4,3};
        int pivot =-1;
      
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot==-1){
            rev(nums, 0, nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]  ){
                swap(nums, i, pivot);
                break;
                
            }
        }


        rev(nums, pivot+1, nums.length-1);
    }
}

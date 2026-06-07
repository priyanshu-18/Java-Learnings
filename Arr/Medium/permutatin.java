package Arr.Medium;

import java.util.Arrays;

public class permutatin {

    static void rec(int arr[],int index){
        if(arr.length == index){
        System.out.println(Arrays.toString(arr));
        return;
        }

        for(int i=index;i<arr.length;i++){
            int temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

            rec(arr,index+1);

            temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }
    
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        rec(arr, 0);

    }
}

package Arr.Hard;

import java.util.ArrayList;

public class Reverse_pair {

    static void merge_sort(int arr[],int low, int high){
        if(low>=high) return;

        int mid = (low+high)/2;

        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr, low, mid,high);
    }

    static void merge(int arr[],int low,int mid,int high){
        int count=0;
        int left = low;
        int right=mid+1;

        ArrayList<Integer> temp = new ArrayList<>();

       while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {

                temp.add(arr[left]);

                left++;

            } else {

                temp.add(arr[right]);

                right++;

            }

        }

        while (left <= mid) {

            temp.add(arr[left]);

            left++;

        }

        while (right <= high) {

            temp.add(arr[right]);

            right++;

        }

        for (int i = low; i <= high; i++) {

            arr[i] = temp.get(i - low);

        }
    }
    public static void main(String[] args) {

        // int nums[]={1,3,2,3,1};
        // int n = nums.length;

        // int count=0;
        // for(int i=0;i<n;i++){

        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]>2L*nums[j]){
        //             count++;
        //         }
        //     }
        // }

        // System.out.println(count);

        // ==========================
        // ===== OPtimal ============
        // ==========================


        int nums[]={1,3,2,3,1};
        int n = nums.length;

        
        
    }
}

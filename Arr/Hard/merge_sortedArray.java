package Arr.Hard;

import java.util.Arrays;

public class merge_sortedArray {
    public static void main(String[] args) {
        // ==========================
        // ===== Brute Force =====
        // ==========================

        int nums1[]={1,2,3,0,0,0};
        int n =3;
        int nums2[]={2,5,6};
        int m =3;

    //            int ans[]=new int[m+n];
    //     int pos=0;
    //     for(int i=0;i<m;i++){
    //     ans[pos]=nums1[i];
    //     pos++;
    //     }

    //     for(int i=0;i<n;i++){
    //    ans[pos]=nums2[i];
    //     pos++;
    //     }

    //     Arrays.sort(ans);

    //     for(int i=0;i<m+n;i++){
    //         nums1[i]=ans[i];
    //     }


        // ==========================
        // ===== better  =====
        // ==========================
    //     while(left<m && right <n){
    //     if(nums1[left]<=nums2[right]){
    //         ans[pos]=nums1[left];
    //         left++;
    //         pos++;
    //     }
    //     else{
    //         ans[pos]=nums2[right];
    //         right++;
    //         pos++;
    //     }

    // }
    //     while(left<m){
    //         ans[pos]=nums1[left];
    //         left++;
    //         pos++;
    //     }

    //     while(right<n){
    //         ans[pos]=nums2[right];
    //         pos++;
    //         right++;
    //     }


    //     for(int i=0;i<m+n;i++){
    //      nums1[i]=ans[i];
    //     }


    // ==========================
    // ===== Optimal  =====
    // ==========================






    }
}

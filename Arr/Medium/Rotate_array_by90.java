package Arr.Medium;

import java.util.Arrays;

public class Rotate_array_by90 {

    static void swap(int arr[][],int a1,int b1,int a2,int b2){
        int temp = arr[a1][b1];
        arr[a1][b1]=arr[a2][b2];
        arr[a2][b2]=temp;
    }
   

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}} ;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j =i+1;j<n;j++){
                swap(matrix, i, j, j,i);
            }
        }
        
        for(int i=0;i<m;i++){
            
                    int left =0;
                    int right = matrix.length-1;
            
            while(left<right){
                swap(matrix, i, left, i, right);
                left++;
                right--;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}

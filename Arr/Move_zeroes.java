package Arr;
import java.util.Arrays;
public class Move_zeroes {
    public static void main(String[] args){
        int arr[]={1,3,12,0,12};
        int pos=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos] = arr[i];
                pos++;
            }
        }
        while(pos < arr.length){
            arr[pos] =0;
            pos++;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}

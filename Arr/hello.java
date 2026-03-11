package Arr;
import java.util.Arrays;
public class hello {
    public static void main(String[] args){
        int arr[] ={0,1,3,0,12};
        int pos =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos] = arr[i];
                pos++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

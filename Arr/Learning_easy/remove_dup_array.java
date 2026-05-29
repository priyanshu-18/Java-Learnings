import java.util.Arrays;

public class remove_dup_array {
    
    public static void main(String[] args) {



        int arr[]={1,1,2,2,2,3,3};
        int i=1;
        for(int j=1;j<arr.length;j++){
        if(arr[j]!=arr[j-1]){
            arr[i]=arr[j];
            i++;
        }    
        }

        //System.out.println(Arrays.toString(arr));

       


    }
}

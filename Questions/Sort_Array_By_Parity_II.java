

public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
        int arr[] ={4,2,5,7};
        int even=0;
        int odd=1;
        int n = arr.length;
        for(int i=0;even<n && odd<n;i++){
            if(arr[even]%2==0){
                even+=2;
            }else if(arr[odd]%2!=0){
                odd+=2;
            }else{
                int temp = arr[even];
                arr[even]=arr[odd];
                arr[odd]=temp;
            }
        }
    }
}

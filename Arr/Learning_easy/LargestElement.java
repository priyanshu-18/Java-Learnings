
public class LargestElement {

    public static void main(String[] args) {
       
        //methods 1(brute)
        int arr[]={2,3,4,5,6,4,3,2,7};
        int largest= arr[0];
        
        for(int i = 1 ;i < arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    
}

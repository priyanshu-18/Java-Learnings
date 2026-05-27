
public class LargestElement {

    public static void main(String[] args) {
       
        //methods 1(brute)

        // int arr[]={2,3,4,5,6,4,3,2,7};
        // int largest= arr[0];
        
        // for(int i = 1 ;i < arr.length;i++){
        //     if(arr[i]>largest){
        //         largest = arr[i];
        //     }
        // }
        // System.out.println(largest);



        //method 2 (optimal)

        int arr[]={2,3,4,5,6,4,3,2,7};
        int largest = arr[0];
        int Slargest = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                Slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>Slargest){
                Slargest=arr[i];
            }
        }
        System.out.println(Slargest);


        //now we have to do same things for the Second Smallest code
        int Smallest = arr[0]; int SSmallest = Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<Smallest){
                SSmallest = Smallest;
                Smallest = arr[i];
            }
            else if(arr[i]<Smallest && arr[i]>SSmallest){
                SSmallest=arr[i];
            }
        }
        System.out.println(SSmallest);



    }
    
}

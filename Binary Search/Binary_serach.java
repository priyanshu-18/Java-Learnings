

public class Binary_serach {


    static void rec_binary(int arr[],int low,int high,int target){
        int mid = (low+high)/2;
        if(target == arr[mid]) {System.out.println(true); return;}
        else if(arr[mid] > target){
            rec_binary(arr, low, mid-1, target);
        }
        else{
           rec_binary(arr, mid+1, high, target);
        }

    }
    public static void main(String[] args) {
        
        int arr[]={3,4,6,7,9,12,16,17};

        int low = 0;
        int high =arr.length-1;
        int target = 12;
        boolean found = false;

        while(low<=high){

            int mid = (low+high)/2;

            if(target == arr[mid]){ System.out.println(true); found = true; break;}

            else if(target > arr[mid]) low =mid+1;
            else if(target < arr[mid]) high =mid-1;
        }

        if(!found){
            System.out.println(false);
        }
        
    }
}

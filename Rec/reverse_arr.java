public class reverse_arr {

    static void rev_arr(int arr[],int index){
        if(index > arr.length-1) return;
        rev_arr(arr,index+1);
        System.out.print(arr[index]+" ");
    } // this one prints rev array but not modify the arr 

    static void rev_arr_modify(int arr[],int left,int right){
        if(left>=right) return;

        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        rev_arr_modify(arr, left+1, right-1);
    }
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,};
        // rev_arr(arr,0);
        rev_arr_modify(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
        
    }
}

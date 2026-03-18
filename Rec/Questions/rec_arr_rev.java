
public class rec_arr_rev {
    public static void main(String[] args) {
        int arr[]={1,4,6,87,5,4,4};
        rec(0,arr);
         for(int i:arr){
            System.out.print(i+" ");
         }
    }
    static void rec(int i,int arr[]){
        if(i>=((arr.length-1)/2)) return;
        
        int temp = arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=temp;
        rec(i+1,arr);
     
    }
}

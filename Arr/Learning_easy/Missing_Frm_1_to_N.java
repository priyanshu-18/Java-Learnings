public class Missing_Frm_1_to_N {
    public static void main(String[] args) {
        int miss=0;
        int arr[]={1,2,4,5};
        if(arr[0]!=1){
            System.out.println("missing answer");
            return;
        }else{

             miss = arr[0];
        }

        for(int i=0;i<arr.length;i++){
            if(miss!=arr[i]){
                System.out.println("Missing : "+miss);
                break;
            }
            miss++;
        }

        
    }
}

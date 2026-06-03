public class Maximum_Consecutive_Onces {
    
    public static void main(String[] args) {
        
        //int arr[] = {1,1,0,1,1,1};
       // special case int arr[] = {1,1,1,0,0};
        int arr[] = {1,1,0,0,1};
        int j = 0;
        int count_one =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count_one++;
                j = Math.max(count_one, j);
            }else{
                count_one=0;
            }
        }

       
        if(count_one>j){
            System.out.println(count_one);
        }else{
            System.out.println(j);
        }
            

    }
}

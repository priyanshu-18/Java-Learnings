package Binary_Search;

public class square_root {
    public static void main(String[] args) {
        
        int n = 36;

        int low=1;

        int high = n;



        while(low<=high){

            int mid = low + (high - low)/2;

            if(mid==n/mid && n%mid==0){
                System.out.println(mid); 
                break;
            } 

            if(mid >=n/mid){
                high = mid-1;
            }else{
                low = mid+1;
            }

            
        }


        //ok so hope its ok 
        
    
    }
}

package Binary_Search;

public class Nth_root {
    public static void main(String[] args) {
        int N = 3;
        int M = 27;


        int low = 1;
        int high = M;

        while(low<=high){

            int mid  = low + (high - low)/2;

            int val = 1;

            for(int i=0;i<N;i++){
                val *=mid;
                if(val > M) break;
            }

            if(val==M){
                System.out.println(mid);
                break;
            }

            if(val >= M){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        System.out.println((int)Math.ceil((double)7/4));

    }
}

package Binary_Search;

public class minimum_days_to_make_m_boquets {
    public static void main(String[] args) {
        int nums[]={1,10,3,10,2};
        int m =3;
        int k=1;

        if((long)m*k > nums.length){ 
            System.out.println(-1);
           return;

        }

        int low=Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int result=-1;

        for(int num : nums){
            low = Math.min(low, num);
            high = Math.max(high, num);
        }


        while(low<=high){

            int mid = low +(high-low)/2;

            int cnt=0;
            int bouquets =0;

            for(var num : nums){
                if(num<=mid){
                    bouquets++;
                    if(bouquets==k){
                        cnt++;
                        bouquets=0;
                    }
                    
                }else{
                    bouquets=0;
                }
            }

            if(cnt>=m){
                result =mid;
                high = mid-1;
            }else{
                low = mid+1;
            }



        }

        System.out.println(result);
    }
}

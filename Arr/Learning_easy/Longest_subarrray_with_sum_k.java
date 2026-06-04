import java.util.HashMap;

public class Longest_subarrray_with_sum_k {
    public static void main(String[] args) {
        int arr[]={1,-1,5,-2,3};
        int k=3;
        int prefixSum=0;
        int length_ans=0;
        HashMap hash = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            prefixSum +=arr[i];
            hash.put(prefixSum,i);

            if(prefixSum==k){
                int length = i +1; 
                if(length>length_ans){
                    length_ans = length;
                }
            }
            if(!hash.containsKey(prefixSum)){
                hash.put(prefixSum, i);
            }
        }





    }
}

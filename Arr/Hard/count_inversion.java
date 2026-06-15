package Arr.Hard;

public class count_inversion {
    public static void main(String[] args) {
        
        int nums[]={2, 4, 1, 3, 5};
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}

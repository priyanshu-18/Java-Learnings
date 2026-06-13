package Arr.Hard;
import java.util.*;;
public class _4sum {
    public static void main(String[] args) {
        int nums[]={1,0,-1,0,-2,2};
        int target=0;
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<n-3;i++){

            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<n-2;j++){

                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int left = j+1;
                int right = n-1;

                while (left<right) {
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> row = new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[left]);
                        row.add(nums[right]);
                        list.add(row);
                        left++;
                        right--;

                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                        while (left<right && nums[right]==nums[right+1]) {
                            right--;
                        }
                    }else if(sum>target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }

    }
}

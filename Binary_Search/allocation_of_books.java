package Binary_Search;

public class allocation_of_books {

     public static boolean valid_Pages(int nums[],int mid,int k){
        
        int Student=1;
        int sum =0;
        
        for(int num : nums){
            sum+=num;
            if(sum>mid){
                Student++;
                sum = num;
            }
            
            if(Student>k) return false;
            
        }
        
        return true;
        
    }
    public static void main(String[] args) {
        int nums[]={10,20,30,40};
        int k = 2;
        
        if(k>nums.length) return;
        
        
        
          int low = 0;
          int high = 0;
          int res = -1;
          
          for(int num : nums ){
            low = Math.max(low,num);
            high += num;
          }
          
          
          while(low<=high){
              
              int mid = low + (high - low)/2;
              
              if(valid_Pages(nums,mid,k)){
                  res = mid;
                  high= mid -1;
              }else{
                  low = mid+1;
              }
          }
          
          System.out.println(res); 
        
        

    }
}

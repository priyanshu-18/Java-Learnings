package Binary_Search;

import Arr.Medium.next_permuatation;

public class capcity_of_ship_packages_within_D_days {
    public static void main(String[] args) {
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;


        int low = 0;
        int high = 0;
        int res = -1;

        for(var num : weights){
            low = Math.max(low,num);
            high +=num;
        }

        while(low<=high){
            
            int mid = low +(high -low)/2;

            int capacity=0;
            int day =1;

            for(int num : weights){
                capacity += num;
                
                if(capacity>mid){
                    day++;
                    capacity=num;
                }


            }


            if(day<=days){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;

            }
        }

        System.out.println(res); 
        
    }
}

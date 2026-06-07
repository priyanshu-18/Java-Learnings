package Arr.Medium;

public class Best_time_to_buy_sell_stock {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int n = prices.length;

        // ==========================
        // ===== Brute Force ========
        // ==========================
        // int sell=0;
        // int buy=0;
        // int max_profit=0;

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((prices[j]-prices[i])>max_profit){
        //             max_profit=prices[j]-prices[i];
        //             sell = prices[j];
        //             buy=prices[i];
        //         }
        //     }
        // }

        // System.out.println(max_profit);
        // System.out.println(buy);
        // System.out.println(sell);


        // ==========================
        // ===== Optimal code =====
        // ==========================
        // int sell=0;
        // int buy=0;
        // int max_price=0;
        // int min_price=Integer.MAX_VALUE;
        // int max_profit=0;

        // for(int i=0;i<n;i++){
        // if(prices[i]<min_price){
        //     min_price =  prices[i];
        // } 
        // int profit = prices[i]-min_price;

        // if(profit>max_profit){
        //    max_profit=profit;
        //    buy=min_price;
        //    sell=prices[i];
        // }

            
        // }

        // System.out.println(max_profit);
        // System.out.println(buy);
        // System.out.println(sell);

        int nums[]={7,1,5,3,6,4};
        int min_price= Integer.MAX_VALUE;
        int max_price = 0;
        for(var price :nums){

            min_price = Math.min(min_price,price);
            max_price = Math.max(max_price,price-min_price);

        }

        System.out.println(max_price);
    }
}

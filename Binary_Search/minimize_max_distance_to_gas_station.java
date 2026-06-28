package Binary_Search;

public class minimize_max_distance_to_gas_station {

    
    public static boolean valid_stations(int stations[],double mid,int k){
        
        int stationsRequired =0;
        
        for(int i=0;i<stations.length-1;i++){
            int dist = stations[i+1]-stations[i];
            int stats = (int)(dist/mid);
            stationsRequired +=stats;
            
        }
        
        return stationsRequired <= k;
    }
    
    
    public static void main(String[] args) {
        
        int stations[]={3,6,12,19,33};
        int K = 3;
        
        double low = 0;
     double high = 0;   // also we can take it to maximum  1e6
    
    for(int i=0;i<stations.length-1;i++){
        high = Math.max(high,stations[i+1]-stations[i]);
    }
    
    
    while((high - low) > 1e-6){
        
        double mid = low + (high - low)/2;
        
        if(valid_stations(stations, mid, K)){
            high = mid;
        }else{
            low = mid;
        }
    }
    
    System.out.println(low);

        
    }
}

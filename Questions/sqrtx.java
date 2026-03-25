public class sqrtx {

    static int rec_sqrt(int low,int high,int x,int possible){
        if(low>high) return possible;
        int mid = (low+high)/2;
        if(mid == x/mid) return mid;
        else if(mid > x/mid) return rec_sqrt(mid+1, high, x, mid);
        else { return rec_sqrt(low, mid-1, x, possible);}
    }
    public static void main(String[] args) {
        System.out.println(rec_sqrt(1, 8,8 , 0));
    }
    
}

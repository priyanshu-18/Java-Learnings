public class n_to_1 {

    
    static void rec(int n){
        if(n>10){
            return;
        }
        System.out.println("up"+n);
        rec(n+1);
        System.out.println("down"+n);

    }
    public static void main(String[] args) {
        rec(0);
    }
}

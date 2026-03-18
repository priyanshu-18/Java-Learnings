
public class rec_parameter_function_way {
    public static void main(String[] args) {
        System.out.println(rec(0,5));
    }


    // this is the funcitonal way of reccurion
    static int rec(int i,int n){
        if(i>n){
            return 0;
        }
        return i + rec(i+1,n);
    } 







    // this is parameter way of reccurion 
    // static void rec(int i,int sum,int n){
    //     if(i>n){
    //     System.out.println(sum);
    //     return;
    //     }
    //     rec(i+1,sum+i,n);
    // }


    



}

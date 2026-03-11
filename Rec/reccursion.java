package Rec;
public class reccursion {
    public static void main(String[] args){
        // int i =0;
        rec(3);

    }


    static void rec(int i){
    if(i == 0) return;
    rec(i - 1);
    System.out.print(i + " ");
}
}

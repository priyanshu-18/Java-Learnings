package Arr;
public class print {
    public static void main(String[] args) {
        rec(1);
    }
    static void rec(int i){
        if(i <0) return;
        System.out.println(i);
        rec(i-1);
    }
}

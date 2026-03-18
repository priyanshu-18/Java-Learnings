
import java.util.Scanner;

public class reccursion_questions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(0,n);
       
    }

    static void printNames(int i){
        if(i==5) return;
        System.out.println("Priyanshu");
        i++;
        printNames(i);
    }

    static void rec(int i,int n){
        if(i>n) return;
        System.out.println(i);
        rec(i+1,n);
    }
}



package Arr;
public class patterns {
    public static void main(String[] args){
        pattern5();
    }

    static void pattern2(){
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


     static void pattern3(){
        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
     static void pattern4(){
        int n =5;
        for(int i =1;i<=5;i++){
            for(int j =1;j<=n-(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
     static void pattern5(){
        int n =5;
        for(int i =0;i<=4;i++){
            for(int l=0;l<n-i-1;l++){
                System.out.print(" ");
            }
            for(int j =0;j<(2*i)+1;j++){
                System.out.print("*");
            }for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    





















    static void pattern1(){
        for(int i =1;i<=4;i++){
            for(int j =1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

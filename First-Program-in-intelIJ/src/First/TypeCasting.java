package First;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println(num);


        // Type casting
//        int num = (num) (67.56f);
//        System.out.println(num);


        // Automatic type promotion in expression
        int a =257;
        // byte max is 256 but we gave the 257 so its jsut 256 % 257 = 1 is gaves the remiander .
        byte  b = (byte)(a);
//        System.out.println(b);

//            byte a1 =40;
//            byte b1 =50;
//            byte c =100;
//            int d = (a1 * b1)/c;
//        System.out.println(d);



        byte b3 = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d2 = 0132345;
        double result = (f * b3) + (i / c) - (d2 - s);



    }


}

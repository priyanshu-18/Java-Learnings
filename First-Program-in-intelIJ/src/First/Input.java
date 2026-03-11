package First;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur university rollno : ");
        int a = sc.nextInt(); // For Int
        String b = sc.next(); // For String (After Space Word Will Not Cover So U Need to use the (Sc.nextLine))
        String c = sc.nextLine(); // For String (After spce value cover)
        Float d = sc.nextFloat(); // For Float;

        System.out.println("Your University Rollno is " + a);
    }
}

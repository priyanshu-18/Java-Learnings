package Greedy_Algorithm.Easy;
import java.util.*;
public class valid_parenthesis_string {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string S : ");
        String s = sc.nextLine();

        Stack<Integer> open_Parenthesis = new Stack<>(); 
        Stack<Integer> star = new Stack<>(); 

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open_Parenthesis.push(i);
            }else if(s.charAt(i)=='*'){
                star.push(i);
            }else{
                if(!open_Parenthesis.isEmpty()){
                    open_Parenthesis.pop();
                }else if(!star.isEmpty()){
                    star.pop();
                }else{
                    System.out.println(false);
                    return;
                }
            }

            
        }
        while(!open_Parenthesis.isEmpty() && !star.isEmpty()){
            if(star.peek() > open_Parenthesis.peek()){
                open_Parenthesis.pop();
                star.pop();       
            }else {
                System.out.println(false);
                return;
            }
        }

        if(open_Parenthesis.isEmpty() && star.isEmpty()){
            System.out.println(true);
            return;
        }else{
            System.out.println(false);
            return;
        }

    }

    }


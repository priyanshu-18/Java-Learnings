package String.Easy;

import Binary_Search.arr_roateted_how_many_times;

public class Remove_outermost_parenthesis {
    public static void main(String[] args) {
        String s = "((()))(()())";
        int count =0;
        String ans ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count>0){
                    ans += s.charAt(i);
                }
                count++;
            }else{
                count--;
                if(count>0){
                    ans += s.charAt(i);
                }
            }
        }
        System.out.println(ans);
    }
}

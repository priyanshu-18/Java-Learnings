package Reccursion.Easy.hard;
import java.util.*;


public class palindromic_string {

    // to check palindrome
    static boolean palindrome(String s , int start , int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // reccursion bro. 

    static void rec (List<List<String>> ans, List<String> curr , String s , int start){
        // base case
        if(start == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }

        //for + rec + backtrack

        for(int i = start;i<s.length();i++){
            if(palindrome(s, start, i)){
                // store if it's palindrome or move onn haha
                curr.add(s.substring(start,i+1));

                // rec
                rec(ans, curr, s, start+1);

                // backtrck

                curr.remove(curr.size()-1);
            }
        }
    }

    public static void main(String[] args) {
    // Input: s = "aab"
    // Output: [["a","a","b"],["aa","b"]]    

        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        rec(ans,curr,"aba",0);
        System.out.println(ans);
    }
}

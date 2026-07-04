package String.Easy;

public class reverse_word_in_string {
    public static void main(String[] args) {
        String s = "the sky is blue";
         s= s.trim();
        StringBuilder ans = new StringBuilder();  

        int right = s.length()-1;
            int end = right;

        while(right>=0){
            if(s.charAt(right)==' '){
            int space = right+1;
            ans.append(s.substring(space,end+1));
            ans.append(" ");
            while(right>=0 && s.charAt(right)==' '){
                right--;
            }
            end = right;
            }
            right--;
        }
        ans.append(s.substring(0,end+1));
         ans.toString();
    }
}

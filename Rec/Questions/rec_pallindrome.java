
public class rec_pallindrome {
    public static void main(String[] args) {
       System.out.println(rec("priyanshu",0));
    }

    static boolean rec(String n,int i){
        if(i>(n.length()-1)/2){
            return true;
        }
        
        if(n.charAt(i)!=n.charAt(n.length()-1-i)) return false;
        return rec(n,i+1);
    }
}

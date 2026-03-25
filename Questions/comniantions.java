import java.util.ArrayList;
import java.util.List;

public class comniantions {

    static void com(int n,int k,List<Integer> temp,List<List<Integer>> outputArray,int start){
        if(k==0){
            
            outputArray.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            com(n,k-1,temp,outputArray,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<Integer>temp = new ArrayList<>();
        List<List<Integer>> outputArray= new ArrayList<>();

        com(n, k, temp, outputArray, k);
        
    }
}

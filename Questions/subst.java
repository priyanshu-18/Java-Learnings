import java.util.ArrayList;
import java.util.List;

public class subst {

    static void rec(int arr[],List<Integer> temp,List<List<Integer>> outputArray,int index){
       outputArray.add(new ArrayList<>(temp));
       for(int i=index;i<arr.length;i++){
        temp.add(arr[i]);
        rec(arr,temp,outputArray,i+1);
        temp.remove(temp.size()-1);
       } 
    }
    public static void main(String[] args) {
        
    }  
}

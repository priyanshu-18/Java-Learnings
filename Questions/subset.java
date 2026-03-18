import java.util.ArrayList;
import java.util.List;

public class subset {

    static void subset(int arr[],List<Integer> temp,List<List<Integer>> outputArray ,int index){
        if(index>arr.length-1){
            outputArray.add(new ArrayList<>(temp));
            return;
        }

        // 1st condition
        temp.add(arr[index]);
        subset(arr,temp,outputArray,index+1);
        temp.remove(temp.size() -1);
        subset(arr,temp,outputArray,index+1);
        


    }
    public static void main(String[] args) {

        int arr[]={1,2,3};
       List<List<Integer>> outputArray = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();

       subset(arr,temp,outputArray,0);

       System.out.println(outputArray);
    }
}

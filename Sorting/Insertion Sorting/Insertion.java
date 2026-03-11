

public class Insertion {

        public static void main(String[] args) {
            int arr[] = {13,46,24,52,20,9};
            int n = arr.length;
            for(int i=0;i<n-1;i++){
                int current = arr[i];
                int j = i-1;

                while(j>=0 && arr[j]>current){
                    arr[j+1]=current;
                    j--;
                }
                arr[j+1] =current;
            }
        
        }

}
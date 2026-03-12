

public class Insertion {

        public static void main(String[] args) {
            int arr[] = {13,46,24,52,20,9};
            int n = arr.length;
            for(int i=1;i<n;i++){
                int current = arr[i];
                int j = i-1;

                while(j>=0 && arr[j]>current){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1] =current;
            }
        
            for(int i : arr){
                System.out.print(i+" ");
            }
        
        }

}
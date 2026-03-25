public class quick_sorting{

    static void quick_sort(int arr[],int low,int high){
        if(low<high){
            int pIndex = partition(arr,low,high);

            quick_sort(arr, low, pIndex -1);
            quick_sort(arr, pIndex+1,high);
        }

    }

    static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){

            while(arr[i] <= pivot && i <= high-1){
                i++;
            }

            while(arr[j] > pivot && j >=low+1){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
    public static void main(String[] args) {
        

    }
}
import java.util.*;

public class merge_sorting {

    static void merge_sort(int arr[], int low, int high) {

        if (low >= high) return;

        int mid = (low + high) / 2;

        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);   

        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {

        int arr[] = {3,1,2,4,1,5,2,6,4};

        merge_sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
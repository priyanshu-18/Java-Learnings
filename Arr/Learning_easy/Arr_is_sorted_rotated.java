public class Arr_is_sorted_rotated {
    
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int count=0;
        // if the array is sorted or rotated both :

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                count++;
            }
        }

        // so in the array {3,4,5,2,1} .. if we comapre first and second element i mean n or n+1 so we can seem that the order break at index 3 in the given array so after taht it is ok and ONE MORE THING WE HAVE TO COMPARE THE LAST AND FIRST ELEMENT TOO BECAUE IT IS CIRCULAR I MEAN ROTATED ARRAY ... 

        // IF THE (COUNT <= 1)) THEN RETURN TRUE if not then FALSE
    }
}

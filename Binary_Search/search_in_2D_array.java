package Binary_Search;

public class search_in_2D_array {
    public static void main(String[] args) {
        int matrix[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60},
        };

        int row1 = matrix.length;
        int col1 = matrix[0].length;

        int low =0;
        int high = (col1*row1) - 1;
        int target = 20;


        while(low<=high){

            int mid = low + (high - low)/2;

            int row = mid/col1;
            int col = mid%col1;

            if(matrix[row][col]==target){            
                System.out.println( true); 
                return;
            }

            if(matrix[row][col]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        System.out.println(false);
        


    }
}

package Binary_Search;

public class search_in_2d_soreted_array_II {

    public static void main(String[] args) {
        
    
         int matrix[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60},
        };

        int target = 23;


        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = n-1;


        while(i<m && j>=0){

            if(matrix[i][j] == target){ 
                System.out.println(true); 
                return;}

            if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }

        System.out.println(false); 
    }

}


package Binary_Search;

public class Find_the_peak_element_II {
    public static void main(String[] args) {

        // ==========================
        // ===== Brute Force ========
        // ==========================
        
        // int mat[][] ={
        //     {1,4},
        //     {3,2}
        // };

        // int row = mat.length;      // row
        // int col = mat[0].length;   // coloumn

        
        // for(int i=0;i<row;i++){

        //     for(int j=0;j<col;j++){
        //         int top = -1;
        //         int left = -1;
        //         int right = -1;
        //         int bottom = -1;

        //         if((i-1)>0){
        //             top = mat[i-1][j] ;
        //         }
        //         if((j-1)>0){
        //             left=mat[i][j-1];
        //         }       
        //         if((j+1)<col){
        //             right =mat[i][j+1];
        //         }
        //         if((i+1)<row){
        //             bottom = mat[i+1][j];
        //         }         
                

        //         int current =mat[i][j];
        //         if(current>top && current>left && current>right && current>bottom){
                 
        //             System.out.println(i+" "+j);
        //             return;
        //         }

             
        //     }
        // }



        // ==========================
        // ===== Optimal  ===========
        // ==========================

        int mat[][] ={
            {1,4},
            {3,2}
        };

        // int row = mat.length;
        int col = mat[0].length;

        int low =0;
        int high = col-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            int max=Integer.MIN_VALUE;
            int row=0;
            for(int i=0;i<mat.length;i++){
                if(max<mat[i][mid]){
                    max = mat[i][mid];
                    row = i;
                }
            }

            int left=-1;
            int right =-1;

            if(mid>0){
                left = mat[row][mid-1];
            }
            if(mid<mat[0].length-1){
                right=mat[row][mid+1];
            }

            int current=mat[row][mid];
            if(current > left && current > right ){
                System.out.println(row+" "+mid);
                return;
            }
            else if(left>current){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
    }
}

package Binary_Search;

public class find_row_with_maximum_1s {
    
    public static void main(String[] args) {


        // ==========================
        // ===== Brute Force ========
        // ==========================

        // int matrix[][]={
        //     {0,1,1,1},
        //     {0,0,1,1},
        //     {1,1,1,1},
        //     {0,0,0,0}
        // };

        // int row = matrix.length;
        // int col = matrix[0].length;

        // int answer =-1;
        // int overall_count=0;
        // for(int i=0;i<row;i++){
        //     int count =0;
        //     for(int j=0;j<col;j++){
        //         if(matrix[i][j]==1){
        //             count++;
        //         }
        //     }
        //     if(count>overall_count){
        //         overall_count=count;
        //         answer = i;
        //     }

        // }

        // System.out.println(answer);




        // ==========================
        // ===== Optimal (BS)  ======
        // ==========================

        // int matrix[][]={
        //     {0,1,1,1},
        //     {0,0,1,1},
        //     {1,1,1,1},
        //     {0,0,0,0}
        // };

        // int row = matrix.length;
        // int col = matrix[0].length;
        // int max_count=0;
        // int ans_row =-1;

        // for(int i=0;i<row;i++){
        //     int low =0;
        //     int high = col-1;
        //     int res = -1;
        //     int  count = 0;
            
        //     while(low<=high){

        //         int mid = low + (high-low)/2;

        //         if(matrix[i][mid]==1){
        //             res = mid;
        //             high = mid-1;
        //         }else{
        //             low = mid+1;
        //         }
        //     }

        //      count = (res==-1) ? 0 : col - res;

             
        //     // if(res==-1){
        //     //  count = 0;    
        //     // }else{
        //     //     count = col - res;
        //     // }

            

        //    if(count>max_count){
        //     max_count=count;
        //     ans_row=i;
        //    }
            
        // }
        // System.out.println(ans_row);



        // ======================================
        // ===== Top Right Pointer Approach =====
        // ======================================

        int matrix[][]={
            {0,1,1,1},
            {0,0,1,1},
            {1,1,1,1},
            {0,0,0,0}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        int left=0;         //row
        int right = col-1; //col
        int max_count=0;
        int count=0;
        int ans_row=0;

        while(left<row && right>=0){

            if(matrix[left][right]==1){
                ans_row = left;
                right--;
            }else{
                left++;

            }


        }

        System.out.println(ans_row);

    }
}

package Arr.Medium;

import java.util.Arrays;

public class set_matrix_zero {
    public static void main(String[] args) {

        // ==========================
        // =====  Brute Force =======
        // ==========================
        
        // int matrix[][] = {{1,1,1},{1,0,1},{0,1,1}};
        // int m = matrix.length;
        // int n = matrix[0].length;

        // boolean row[] = new boolean[m];
        // boolean col[] = new boolean[n];

        
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             row[i]=true;
        //             col[j]=true;
        //         }
        //     } 
                
        // }


        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(row[i]==false && col[j]==false){
                    
        //         }else{
        //             matrix[i][j]=0;
        //         }
        //     } 
                
        // }

        

        // System.out.println(Arrays.deepToString(matrix));




        // ==========================
        // ===== optimal solution. ==
        // ==========================


        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;

      
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            } 
                
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){package Arr.Medium;

import java.util.Arrays;

public class set_matrix_zero {
    public static void main(String[] args) {

        // ==========================
        // =====  Brute Force =======
        // ==========================
        
        // int matrix[][] = {{1,1,1},{1,0,1},{0,1,1}};
        // int m = matrix.length;
        // int n = matrix[0].length;

        // boolean row[] = new boolean[m];
        // boolean col[] = new boolean[n];

        
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             row[i]=true;
        //             col[j]=true;
        //         }
        //     } 
                
        // }


        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(row[i]==false && col[j]==false){
                    
        //         }else{
        //             matrix[i][j]=0;
        //         }
        //     } 
                
        // }

        

        // System.out.println(Arrays.deepToString(matrix));




        // ==========================
        // ===== optimal solution. ==
        // ==========================


        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;

      
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            } 
                
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            } 
                
        }


      

        System.out.println(Arrays.deepToString(matrix));


    }


}

                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            } 
                
        }


      

        System.out.println(Arrays.deepToString(matrix));


    }


}

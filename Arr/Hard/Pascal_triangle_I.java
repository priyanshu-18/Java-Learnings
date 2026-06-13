package Arr.Hard;

import java.util.*;

public class Pascal_triangle_I {
    public static void main(String[] args) {

        // ==========================
        // ===== 2D Array ===========
        // ==========================
        int numRow = 5;
        int pascal[][]=new int[numRow][numRow];
        // for(int i=0;i<numRow;i++){
        //     pascal[i][0]=1;
        //     pascal[i][i]=1;

        //     for(int j=1;j<i;j++){
        //         pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
        //     }
        // }

        // System.out.println(Arrays.deepToString(pascal));


        // ==========================
        // ===== List ===============
        // ==========================


        List<List<Integer>> list  = new ArrayList<>();

        for(int i=0;i<numRow;i++){
            List<Integer> row = new ArrayList<>();


            for(int j=0;j<=numRow;j++){
                row.add(1);
            }

            for(int k=1;k<i;k++){
                row.set(k, list.get(i-1).get(k-1)+list.get(i-1).get(k));
            }
            list.add(row);
        }

    }
}

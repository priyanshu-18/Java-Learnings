package Greedy_Algorithm.Easy;

import java.util.Arrays;

public class Assign_Coolies {

    public static void main(String[] args) {

        int[] g = {1, 2, 3};   // Greed factors
        int[] s = {1, 1};      // Cookie sizes

        Solution obj = new Solution();

        int ans = obj.findContentChildren(g, s);

        System.out.println("Maximum Content Children = " + ans);
    }
}

class Solution {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {

            if (s[cookie] >= g[child]) {
                child++;
            }

            cookie++;
        }



        return child;
    }
}
package TEMPERARY;

import java.util.Arrays;

public class LC_1252 {
    public static void main(String[] args) {
        int[][] ind={{0,1},{1,1}};
        oddCells(2,3,ind);
    }
    static void oddCells(int m, int n, int[][] indices) {
        int[][] ans=new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;i<n;j++){
                ans[indices[i][0]][j]++;
            }
            for(int k=0;k<m;k++){
                ans[k][indices[i][1]]++;
            }
        }
        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}

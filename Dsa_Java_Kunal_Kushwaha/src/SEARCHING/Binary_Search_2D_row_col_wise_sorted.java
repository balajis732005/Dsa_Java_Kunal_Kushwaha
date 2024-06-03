package SEARCHING;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_2D_row_col_wise_sorted {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("No of rows and columns : ");
        int r=in.nextInt();
        int c=in.nextInt();
        int[][] matrix=new int[r][c];
        System.out.print("Enter your matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.print("Enter the search element : ");
        int target=in.nextInt();
        System.out.print("Element found in : "+ Arrays.toString(search_binary(matrix,target)));
    }
    static int[] search_binary(int[][] mat, int target){
        int r=0;
        int c=mat.length-1;
        while(r<mat.length && c>=0){
            if(mat[r][c]==target){
                return new int[]{r,c};
            }
            else if(target>mat[r][c]){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}

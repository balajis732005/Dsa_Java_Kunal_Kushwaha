package SEARCHING;

import java.util.Scanner;
import java.util.Arrays;

public class Linear_serch_2D {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r=input.nextInt();
        System.out.print("Enter the number of columns : ");
        int c=input.nextInt();
        int[][] Ar=new int[r][c];
        System.out.print("Enter the elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Ar[i][j]=input.nextInt();
            }
        }
        System.out.print("Enter the search element : ");
        int s=input.nextInt();
        int[] index=new int[2];
        index=search_linear_2d(Ar,s);
        System.out.print("Element found in "+Arrays.toString(index));
    }
    static int[] search_linear_2d(int[][] arr,int target){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

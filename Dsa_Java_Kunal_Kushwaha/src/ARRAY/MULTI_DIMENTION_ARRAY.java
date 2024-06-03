package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class MULTI_DIMENTION_ARRAY {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of 2D array(no.of rows) : ");
        int r=in.nextInt();
        System.out.print("Enter the size of 2D array(no.of columns) : ");
        int c=in.nextInt();
        System.out.println("Enter the matrix : ");
        int[][] AR=new int[r][c];
        for(int i=0;i<AR.length;i++){
            for(int j=0;j<AR[i].length;j++){
                AR[i][j]=in.nextInt();
            }
        }
        //TRAVERSAL
        System.out.println("METHOD 1 : ");
        for(int i=0;i<AR.length;i++){
            for(int j=0;j<AR[i].length;j++){
                System.out.print(AR[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("METHOD 2 : ");
        for(int i=0;i<AR.length;i++){
            System.out.println(Arrays.toString(AR[i]));
        }
        System.out.println("METHOD 3 : ");
        for(int[] x:AR){
            System.out.println(Arrays.toString(x));
        }
    }
}

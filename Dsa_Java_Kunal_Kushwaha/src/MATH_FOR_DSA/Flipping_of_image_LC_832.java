package MATH_FOR_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Flipping_of_image_LC_832 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter no of rows and column : ");
        int r=in.nextInt();
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            reverse_array_invert(arr[i]);
        }
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static void reverse_array_invert(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i]^1;
            arr[i]=arr[arr.length-i-1]^1;
            arr[arr.length-i-1]=temp;
        }
        if(arr.length%2==1){
            arr[arr.length/2]^=1;
        }
    }
}

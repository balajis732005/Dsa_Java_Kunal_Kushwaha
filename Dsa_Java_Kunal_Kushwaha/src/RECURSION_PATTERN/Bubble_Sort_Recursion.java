package RECURSION_PATTERN;

import java.util.Arrays;
import java.util.Scanner;
// Similar approach as to pattern_1_Recursion
public class Bubble_Sort_Recursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        bubble_recursion(arr,n-1,0);
        System.out.println("After sorting : "+ Arrays.toString(arr));
    }
    static void bubble_recursion(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble_recursion(arr,r,c+1);
        }else{
            bubble_recursion(arr,r-1,0);
        }
    }
}
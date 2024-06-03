package RECURSION_PATTERN;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort_Recursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        selection_recursion(arr,n,0,0);
        System.out.println("After sorting : "+ Arrays.toString(arr));
    }
    static void selection_recursion(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection_recursion(arr,r,c+1,c);
            }else{
                selection_recursion(arr,r,c+1,max);
            }
        }else{
            if((r-1)!=max) {
                int temp = arr[r - 1];
                arr[r - 1] = arr[max];
                arr[max] = temp;
            }
            selection_recursion(arr,r-1,0,0);
        }
    }
}

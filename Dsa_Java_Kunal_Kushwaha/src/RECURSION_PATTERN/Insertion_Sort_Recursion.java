package RECURSION_PATTERN;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort_Recursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        insertion_recursion(arr,0,0);
        System.out.println("After sorting : "+ Arrays.toString(arr));
    }
    static void insertion_recursion(int[] arr,int r,int c){
        if(r==arr.length){
            return;
        }
        if(c>0){
            if(arr[c-1]>arr[c]){
                int temp=arr[c-1];
                arr[c-1]=arr[c];
                arr[c]=temp;
            }
            insertion_recursion(arr,r,c-1);
        }else{
            insertion_recursion(arr,r+1,r+1);
        }
    }
}

package RECURSION_ARRAYS;

import java.util.Scanner;

public class Array_Sorted_or_not {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        System.out.println("Enter the elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("ARRAY IS SORTED OR NOT : "+check_sorted(arr));
    }
    static boolean check_sorted(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr,int ind){
        if(ind==arr.length-1){
            return true;
        }
        return arr[ind]<arr[ind+1] && helper(arr , ind+1);
    }
}

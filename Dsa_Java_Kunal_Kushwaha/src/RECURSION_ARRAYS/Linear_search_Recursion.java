package RECURSION_ARRAYS;

import java.util.Scanner;

public class Linear_search_Recursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        System.out.print("Enter the elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target=in.nextInt();
        System.out.println("ELEMENT FOUND IN : "+Linear_search_recursion(arr,target));
    }
    static int Linear_search_recursion(int[] arr,int target){
        return helper(arr,target,0);
    }
    static int helper(int[] arr,int target,int ind){
        if(ind==arr.length-1){
            return -1;
        }
        if(arr[ind]==target){
            return ind;
        }
        return helper(arr,target,ind+1);
    }
}

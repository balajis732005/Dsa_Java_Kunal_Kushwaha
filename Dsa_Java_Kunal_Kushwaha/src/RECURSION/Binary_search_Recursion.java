package RECURSION;

import java.util.Scanner;

public class Binary_search_Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] Ar;
        Ar = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            Ar[i] = input.nextInt();
        }
        System.out.print("Enter the search element : ");
        int s = input.nextInt();
        int index=binary_search_recursion(Ar,s,0,Ar.length-1);
        System.out.print("Element found in "+index);
    }
    static int binary_search_recursion(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            return binary_search_recursion(arr,target,mid+1,end);
        }
        return binary_search_recursion(arr,target,start,mid-1);
    }
}

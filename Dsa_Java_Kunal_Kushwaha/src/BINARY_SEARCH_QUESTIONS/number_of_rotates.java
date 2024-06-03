package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class number_of_rotates {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar;
        Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        int pivot=findpivot_index(Ar);
        System.out.print("Number of Rotations : "+(pivot+1));
    }
    static int findpivot_index(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){  // The elements after mid are going to be smaller than start
                end=mid-1;
            }
            if(arr[start]<arr[mid]){
                start=mid+1;     // The elements before mid are going to smaller than mid
            }
        }
        return -1;
    }
}

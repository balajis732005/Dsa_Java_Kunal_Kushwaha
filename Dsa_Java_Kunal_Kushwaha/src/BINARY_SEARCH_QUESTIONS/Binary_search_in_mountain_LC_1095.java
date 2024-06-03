package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class Binary_search_in_mountain_LC_1095 {
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
        int index=search_mountain(Ar,s);
        System.out.print("Element found in "+index);
    }
    static int search_mountain(int[] arr,int target){
        int peak=peak_index_mountain(arr);
        if(arr[peak]==target){
            return peak;
        }
        int first=agnostic_search_binary(arr,target,0,peak);
        if(first!=-1){
            return first;
        }
        return agnostic_search_binary(arr,target,peak+1,arr.length-1);
    }
    static int peak_index_mountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start+(end-start)/2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }
    static int agnostic_search_binary(int[] arr,int target,int low,int high) {
        boolean order=arr[low]<arr[high];
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid]==target){
                return mid;
            }
            else if (order) {
                if (target > arr[mid]) {
                    low = mid + 1;
                } else if (target < arr[mid]) {
                    high = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    high = mid - 1;
                } else if (target < arr[mid]) {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
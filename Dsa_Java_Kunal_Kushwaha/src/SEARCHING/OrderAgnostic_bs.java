package SEARCHING;

import java.util.Scanner;

public class OrderAgnostic_bs {
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
        int index=agnostic_search_binary(Ar,s);
        System.out.print("Element found in "+index);
    }
    static int agnostic_search_binary(int[] arr,int target) {
        int low = 0;
        int high = arr.length - 1;
        boolean order=arr[low]<arr[high];
        while (low <= high) {
            int mid = low+(high-low)/2;
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

package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;
//It Doesn't Contain Duplicate Elements in is give in the Leet Code Question
public class Peak_in_mountain_LC_852_162 {
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
        int index=peak_index_mountain(Ar);
        System.out.print("Peak Element in Mountain Array : "+index);
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
}

package SEARCHING;

import java.util.Scanner;

public class BINARY_SEARCH {
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
        int index=search_binary(Ar,s);
        System.out.print("Element found in "+index);
    }
    static int search_binary(int[] arr,int target){
        int low=0;
        int high=arr.length -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target>arr[mid]){
                low=mid+1;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

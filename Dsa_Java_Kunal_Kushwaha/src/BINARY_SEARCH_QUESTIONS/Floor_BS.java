package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class Floor_BS {
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
        System.out.print("Enter the target element : ");
        int s = input.nextInt();
        int index= floor_num(Ar,s);
        System.out.print("Index of Largest number which is Lesser than or equal to target "+index);
    }
    //FLOOR-> Find the index of Largest number which is Lesser than or equal to target
    static int floor_num(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return end;
    }
}

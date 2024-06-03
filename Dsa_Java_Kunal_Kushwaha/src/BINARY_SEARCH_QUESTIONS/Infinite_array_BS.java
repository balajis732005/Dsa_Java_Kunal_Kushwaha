package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class Infinite_array_BS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] Ar={2,4,5,6,8,10,28,45,67,78,98,112,234,3564,45456,378990};
        System.out.print("Enter the target element : ");
        int s = input.nextInt();
        int index=infinite_search(Ar,s);
        System.out.print("Element found in index "+index);
    }
    static int infinite_search(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+((end-start+1)*2);
            start=temp;
        }
        return search_binary(arr,target,start,end);
    }
    static int search_binary(int[] arr, int target, int start, int end){
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
        return -1;
    }
}

package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class search_in_Rotated_duplicate_array {
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
        System.out.print("Enter the search element : ");
        int s=input.nextInt();
        int index=search_rotate(Ar,s);
        System.out.print("Element found in "+index);
    }
    static int search_rotate(int[] arr,int target){
        int pivot= findpivot_index_duplicate(arr);
        System.out.println("Pivot index : "+pivot);
        if(pivot == -1){
            return search_binary(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>arr[0]){
            return search_binary(arr,target,0,pivot-1);
        }
        return search_binary(arr,target,pivot+1,arr.length-1);
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
    static int findpivot_index_duplicate(int[] arr){
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
            //If start == mid == end , all elements are same meanse
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                //Skip the duplicates
                //But if that skipped element is pivot meanse then what you do
                //check start is pivot or not
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check end is pivot or not
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]>=arr[mid] && arr[mid]<arr[end]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
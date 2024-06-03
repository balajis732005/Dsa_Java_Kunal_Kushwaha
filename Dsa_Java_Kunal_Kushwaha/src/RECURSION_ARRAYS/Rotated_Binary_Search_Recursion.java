package RECURSION_ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotated_Binary_Search_Recursion {
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
        System.out.println("ELEMENT FOUND IN : "+Rotate_Binary_Search(arr,target,0,arr.length-1));
    }
    static int Rotate_Binary_Search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return Rotate_Binary_Search(arr,target,start,mid-1);
            }else{
                return Rotate_Binary_Search(arr,target,mid+1,end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return Rotate_Binary_Search(arr,target,mid+1,end);
        }
        return Rotate_Binary_Search(arr,target,start,mid-1);
    }
}

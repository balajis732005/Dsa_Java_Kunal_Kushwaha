package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class Split_Array_Largest_Sum_LC_410 {
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
        System.out.print("Enter the maximum split 'm' : ");
        int m=input.nextInt();
        int ans=splitarray(Ar,m);
        System.out.println("ANSWER : "+ans);
    }
    static int splitarray(int[] arr, int m){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]); // Maximum in array
            end+=arr[i];  // Sum of elements in array
        }
        //Binary Search
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1; // Why 1 ? Due to last Pieces in tha array, atleast 1
            for(int n:arr){
                if((sum+n)>mid){
                    sum=n; // If sum exceed then the next element is my sum
                    pieces++; // One piece we got
                }else{
                    sum+=n; // Otherwise add the values
                }
            }
            if(pieces<=m){
                end=mid; // To increase the pieces
            }
            if(pieces>m){
                start=mid+1; // To decrease the pieces
            }
        }
        return end;
    }
}

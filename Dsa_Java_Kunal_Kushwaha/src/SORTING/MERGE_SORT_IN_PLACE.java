package SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class MERGE_SORT_IN_PLACE {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        merge_sort_inplace(Ar,0,Ar.length);
        System.out.println("After Sorting : "+ Arrays.toString(Ar));
    }
    static void merge_sort_inplace(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }
        int mid=start+(end-start)/2;
        merge_sort_inplace(arr,start,mid);
        merge_sort_inplace(arr,mid,end);

        merge_inplace(arr,start,mid,end);
    }
    static void merge_inplace(int[] arr,int s,int m,int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        // If any one array is not completed
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}
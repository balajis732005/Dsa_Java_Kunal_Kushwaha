package SORTING;

import java.util.Arrays;
import java.util.Scanner;
//TIME COMPLEXITY [WORST CASE] : O(N^2)
//WHY USE INSERTION SORT? -> BEST FOR PARTIALLY SORTED ARRAY AND WITH LESS NUMBER OF VALUES
public class INSERTION_SORT {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        insertion_sort(Ar);
        System.out.println(Arrays.toString(Ar));
    }
    static void insertion_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}

package SORTING;

import java.util.Arrays;
import java.util.Scanner;
//TIME COMPLEXITY [WORST CASE] : O(N^2)

public class SELECTION_SORT {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        selection_sort(Ar);
        System.out.println(Arrays.toString(Ar));
    }
    static void selection_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-i-1;
            int maxindex=getmax_index(arr,0,last);
            if(last!=maxindex) {
                int temp = arr[maxindex];
                arr[maxindex] = arr[last];
                arr[last] = temp;
            }
        }
    }
    static int getmax_index(int[] arr,int start,int end){
        int maxi=arr[0];
        int ind=0;
        for(int i=start;i<=end;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
                ind=i;
            }
        }
        return ind;
    }
}

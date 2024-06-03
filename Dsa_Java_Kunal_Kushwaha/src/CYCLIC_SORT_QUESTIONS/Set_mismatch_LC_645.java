package CYCLIC_SORT_QUESTIONS;

import java.util.Arrays;
import java.util.Scanner;

public class Set_mismatch_LC_645 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        int[] ans=find_mismatch(Ar);
        System.out.println("SET MISMATCH : "+ Arrays.toString(ans));
    }
    static int[] find_mismatch(int[] arr){
        cyclic_sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void cyclic_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}
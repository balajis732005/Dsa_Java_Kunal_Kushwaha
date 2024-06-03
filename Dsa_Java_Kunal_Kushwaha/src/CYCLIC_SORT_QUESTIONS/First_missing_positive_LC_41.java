package CYCLIC_SORT_QUESTIONS;

import java.util.Scanner;

public class First_missing_positive_LC_41 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        int ans=find_first_missing_positive(Ar);
        System.out.println("FIRST POSITIVE MISSING NUMBER : "+ans);
    }
    static int find_first_missing_positive(int[] arr){
        cyclic_sort_negative(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }
    static void cyclic_sort_negative(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}

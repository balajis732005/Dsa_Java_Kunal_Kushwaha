package CYCLIC_SORT_QUESTIONS;

import java.util.Scanner;
//ELEMENTS 0 TO N
public class Missing_number_LC_268 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        int ans=find_missing_number(Ar,n);
        System.out.println("MISSING NUMBER : "+ans);
    }
    static int find_missing_number(int[] arr,int n){
        cyclic_sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return n;
    }
    static void cyclic_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}

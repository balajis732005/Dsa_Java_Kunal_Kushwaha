package CYCLIC_SORT_QUESTIONS;

import java.util.Scanner;
//ELEMENTS 1 TO N
public class Duplicate_elements_LC_287 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        int ans=find_duplicate_element(Ar);
        System.out.println("DUPLICATE ELEMENT : "+ans);
    }
    static int find_duplicate_element(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    int temp=arr[i];
                    arr[i]=arr[correct];
                    arr[correct]=temp;
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
}

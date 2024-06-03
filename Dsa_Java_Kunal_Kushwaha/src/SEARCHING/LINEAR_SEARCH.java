package SEARCHING;

import java.util.Scanner;

public class LINEAR_SEARCH {
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
        int index=search_linear(Ar,s);
        System.out.print("Element found in "+index);
    }
    static int search_linear(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

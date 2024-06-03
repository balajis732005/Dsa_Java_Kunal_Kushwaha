package SEARCHING;

import java.util.Scanner;

public class min_max_array {
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
        System.out.println("Minimum Element : "+minimum(Ar));
        System.out.print("Maximum Element : "+maximum(Ar));
    }
    static int maximum(int[] arr){
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    static int minimum(int[] arr){
        int mini=arr[0];
        for(int x:arr){
            if(x<mini){
                mini=x;
            }
        }
        return mini;
    }
}

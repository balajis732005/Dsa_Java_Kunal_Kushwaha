package SORTING;

import java.util.Scanner;
import java.util.Arrays;
//TIME COMPLEXITY [WORST CASE] : O(N^2)
public class BUBBLE_SORT {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        bubble_sort(Ar);
        System.out.println(Arrays.toString(Ar));
    }
    static void bubble_sort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            boolean check=true;
            for(int j=1;j<=i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    check=false;
                }
            }
            if(check){
                break;
            }
        }
    }
}
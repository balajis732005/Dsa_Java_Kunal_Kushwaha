package SORTING;

import java.util.Arrays;
import java.util.Scanner;
//NOTE: ONLY APPLICABLE FOR THE CONTINUOUS ARRAY OF 1 TO N (OR) 0 TO N. This program is for 1 to N
//TIME COMPLEXITY [WORST CASE] : O(N)
public class CYCLIC_SORT {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=input.nextInt();
        int[] Ar=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            Ar[i]=input.nextInt();
        }
        cyclic_sort(Ar);
        System.out.println(Arrays.toString(Ar));
    }
    static void cyclic_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1; //For 0 to N -> correct=arr[i]
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

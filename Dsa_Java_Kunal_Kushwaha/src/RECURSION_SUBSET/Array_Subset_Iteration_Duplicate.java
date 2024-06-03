package RECURSION_SUBSET;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Subset_Iteration_Duplicate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter te size of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array Elements with duplicates : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(subsetduplicate(arr));
    }
    static ArrayList<ArrayList<Integer>> subsetduplicate(int[] arr){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        int start=0;
        int end=0;
        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int len=outer.size();
            for(int j=start;j<len;j++){
                ArrayList<Integer> inter=new ArrayList<>(outer.get(i));
                inter.add(arr[i]);
                outer.add(inter);
            }
        }
        return outer;
    }
}
